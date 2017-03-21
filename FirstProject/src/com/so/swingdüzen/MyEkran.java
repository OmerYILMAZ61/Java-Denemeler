package com.so.swingdüzen;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.vektorel.iaraba.IKaporta;

public class MyEkran extends JFrame {

	CardLayout cardLayout;
	JPanel jPanel;
	GirisEkrani girisEkrani;
	AnaSayfa anaSayfa;
	KayitOl kayitOl;
	
	// JPanel jPanelUst;
	// JPanel jPanelMerkez;
	// JPanel jPanelSag;
	// JPanel jPanelSol;
	// JPanel jPanelAlt;

	public MyEkran(int t){
		
	}
	public MyEkran() {
		setSize(250, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		govdeOlustur();
		girisEkrani();
		anaSayfaOlustur();
		kayitOlEkrani();

	}

	public void kayitOlEkrani() {
		kayitOl = new KayitOl(cardLayout, jPanel,"D:/ödevDosyasý/login kisi/kisiler.txt");
		kayitOl.kayitEkraniOlustur();
	}

	public void anaSayfaOlustur() {
		anaSayfa = new AnaSayfa(cardLayout,jPanel);
		anaSayfa.anaSayfaOlustur();
		
	}

	public void govdeOlustur() {
		cardLayout = new CardLayout();
		jPanel = new JPanel(cardLayout);
		
		add(jPanel);
		

	}

	public void girisEkrani() {
		girisEkrani = new GirisEkrani(cardLayout,jPanel);
		girisEkrani.girisEkraniOlustur();
	}
	
	public void ekranKapa(){
		Islem.ekranKapa();
	}

}
