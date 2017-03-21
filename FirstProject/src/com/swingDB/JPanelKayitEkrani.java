package com.swingDB;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelKayitEkrani extends JPanel{

	JTextField jTextField1;
	JTextField jTextField2;
	
	public JPanelKayitEkrani(CardLayout cardLayout, JPanel jPanel) {
		
		this.setLayout(new GridLayout(3, 3));
		this.add(new JLabel("Kullanýcý Adý"));

		jTextField1 = new JTextField(15);
		this.add(jTextField1);
		

		this.add(new JLabel("Þifre"));

		jTextField2 = new JTextField(15);
		this.add(jTextField2);
		
		this.add(new JLabel(""));
		
		JButtonKaydol jButtonKaydol = new JButtonKaydol(jTextField1,jTextField2,jPanel,cardLayout);
		this.add(jButtonKaydol);

		
		
	}
}
