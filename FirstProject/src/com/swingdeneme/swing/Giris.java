package com.swingdeneme;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.net.ssl.HostnameVerifier;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Giris extends JFrame {
	Timer timer;
	int sayac;

	public Giris() {
		CardLayout cardLayout = new CardLayout();

		JPanel jPanel = new JPanel();
		jPanel.setLayout(cardLayout);

		jPanel.add(new JLabel("giriþ yapýlýyor...."),"basarý");
		
		JLabel jLabel = new JLabel("Hoþgeldiniz!!");
		jPanel.add(jLabel,"hosgeldiniz");

		add(jPanel);

		setSize(100, 100);
		setLocationRelativeTo(null);
		setVisible(true);
		
		sayac = 6;
		ActionListener ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					if (sayac == 0) {
						timer.stop();
						setVisible(false);
					} else if (sayac == 3) {
						cardLayout.show(jPanel, "hosgeldiniz");
						sayac--;
					}else{
						sayac--;
					}
			}
		};
		timer = new Timer(200, ac);
		timer.start();

	}
}

