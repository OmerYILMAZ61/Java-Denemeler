package com.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	public MyFrame() {
		JPanel panel = new JPanel(new BorderLayout());
//		CardLayout cardLayout = new CardLayout();
//		JPanel paneller = new JPanel(cardLayout);
		JPanel paneltablo = new JPanel(new GridLayout(3, 3));
		
		paneltablo.add(new JLabel("adi"));
		
		TextField textField1 = new TextField(15);
		paneltablo.add(textField1);
		
		
		paneltablo.add(new JLabel("soyadi"));
		
		TextField textField2 = new TextField(15);
		paneltablo.add(textField2);
		
		JButton jButton1 = new JButton("giriþ");
		
		jButton1.setBackground(new Color(200, 0, 0));
		
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Giris giris = new Giris();
			}
		});
		paneltablo.add(jButton1);
		
		JButton jButton2 = new JButton("þifremi unuttum");
		jButton2.setBackground(new Color(100, 0, 100));
		
		paneltablo.add(jButton2);
		
		panel.add(paneltablo,BorderLayout.NORTH);
		add(panel);
		
		
		
	}
}
