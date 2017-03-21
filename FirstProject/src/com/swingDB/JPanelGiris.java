package com.swingDB;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelGiris extends JPanel{
	
	
	JButton jButtonCik;
	JButton jButtonKaydol;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JButton jButtonUnuttum;
	JButtonGiris jButtonGiris;
	
	
	public JPanelGiris(CardLayout cardLayout, JPanel jPanel) {
		this.setLayout(new BorderLayout());
		//üst panel
		JPanel jPanelUst = new JPanel(new FlowLayout());
		
		jButtonCik = new JButton("çýkýs");
		jPanelUst.add(jButtonCik);
		
		jButtonKaydol = new JButton("kaydol");
		jPanelUst.add(jButtonKaydol);
		
		add(jPanelUst,BorderLayout.NORTH);
		
		//merkez panel
		JPanel jPanelMerkez = new JPanel(new GridLayout(3, 3));
		jPanelMerkez.add(new JLabel("Kullanýcý Adý"));

		jTextField1 = new JTextField(15);
		jPanelMerkez.add(jTextField1);
		

		jPanelMerkez.add(new JLabel("Þifre"));

		jTextField2 = new JTextField(15);
		jPanelMerkez.add(jTextField2);
		
		jButtonGiris = new JButtonGiris(cardLayout,jPanel,jTextField1,jTextField2);
		jPanelMerkez.add(jButtonGiris);

		jButtonUnuttum = new JButton("Þifremi unuttum");
		jPanelMerkez.add(jButtonUnuttum);
		
		add(jPanelMerkez,BorderLayout.CENTER);
		
		
		//buton eklentisi
		jButtonKaydol.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanel,"kayit");
			}
		});
		
		jButtonCik.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Islem.cikis();
			}
		});
		
	}
	
}
