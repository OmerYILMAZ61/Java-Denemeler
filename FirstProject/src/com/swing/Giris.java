package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Giris extends JFrame {

	Timer timer;
	int sayac;

	public Giris() {
		FlowLayout flw = new FlowLayout();

		JPanel jPanel = new JPanel();
		jPanel.setLayout(flw);

		jPanel.add(new JLabel("giriþ yapýldý"));
		JLabel jLabel = new JLabel("baðlandý");
		jPanel.add(jLabel);

		add(jPanel);

		setSize(200, 200);

		setVisible(true);
		
		sayac = 5;
		ActionListener ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					if (sayac == 0) {
						timer.stop();
						setVisible(false);
					} else {
						sayac--;
					}
			}
		};
		timer = new Timer(500, ac);
		timer.start();

	}

}
