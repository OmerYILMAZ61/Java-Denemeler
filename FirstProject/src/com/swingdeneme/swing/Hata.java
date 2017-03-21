package com.swingdeneme.swing;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Hata extends JFrame {
	Timer timer;
	int sayac;

	public Hata() {
		CardLayout cardLayout = new CardLayout();

		JPanel jPanel = new JPanel();
		jPanel.setLayout(cardLayout);

		jPanel.add(new JLabel("giriþ yapýlamadý"),"girma");
		JLabel jLabel = new JLabel("tekrar deneyiniz");
		jPanel.add(jLabel,"dene");

		add(jPanel);

		setSize(100, 100);
		setLocationRelativeTo(null);
		setVisible(true);
		
		sayac = 5;
		ActionListener ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (sayac == 0) {
					timer.stop();
					setVisible(false);
				} else if (sayac == 3) {
					cardLayout.show(jPanel, "dene");
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
