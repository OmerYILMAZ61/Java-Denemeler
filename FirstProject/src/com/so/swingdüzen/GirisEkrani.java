package com.so.swingd�zen;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GirisEkrani {
	CardLayout cardLayout;
	JPanel jPanel;
	JPanel jPanelGirisEkrani;
	JTextField jTextField1;
	JTextField jTextField2;
	JButton jButtonGir;
	JButton jButtonUnuttum;
	String kullaniciAdi,sifre;
	AnaSayfa anaSayfa;
	JButton jButtonKayit;
	KayitOl kayitOl;
	JButton jButtonCik;
	
	public GirisEkrani(CardLayout cardLayout, JPanel jPanel) {
		this.cardLayout = cardLayout;
		this.jPanel = jPanel;
		anaSayfa = new AnaSayfa();
		
	}

	public GirisEkrani() {
		
	}

	public void girisEkraniOlustur() {
		jPanelGirisEkrani = new JPanel(new BorderLayout());
	
		JPanel jPanelUst = new JPanel(new FlowLayout());
		
		GridLayout gridLayout = new GridLayout(3, 3);
		JPanel jPanelMerkez = new JPanel(gridLayout);
		
		jPanelUst.add(new JLabel("sing up ?"));

		jButtonKayit = new JButton("kayit ol");
		jPanelUst.add(jButtonKayit);
		
		jButtonCik = new JButton("��k");
		jPanelUst.add(jButtonCik);

		jPanelMerkez.add(new JLabel("Kullan�c� Ad�"));

		jTextField1 = new JTextField(15);
		jPanelMerkez.add(jTextField1);
		

		jPanelMerkez.add(new JLabel("�ifre"));

		jTextField2 = new JTextField(15);
		jPanelMerkez.add(jTextField2);
		
		
		jButtonGir = new JButton("Giri�");
		jButtonGir.setBackground(new Color(255, 0, 0));
		jPanelMerkez.add(jButtonGir);

		jButtonUnuttum = new JButton("�ifremi unuttum");
		jPanelMerkez.add(jButtonUnuttum);
		
		jPanelGirisEkrani.add(jPanelUst,BorderLayout.NORTH);
		jPanelGirisEkrani.add(jPanelMerkez,BorderLayout.CENTER);
		
		jPanel.add(jPanelGirisEkrani, "giris");
		
		jButtonGir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kullaniciAdi = jTextField1.getText();
				sifre = jTextField2.getText();
				
				LoginKontrol loginKontrol = new LoginKontrol("D:/�devDosyas�/login kisi/kisiler.txt");
				
				if(loginKontrol.kontrolEt(kullaniciAdi,sifre))
				cardLayout.show(jPanel, "ana");
				
				
			}
		});
		
		jButtonKayit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(jPanel, "kayit");
				
				
			}
		});
		

	}
	
}
