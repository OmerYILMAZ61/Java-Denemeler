package com.swingDB;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	CardLayout cardLayout;
	JPanel jPanel;
	
	public MyFrame() {
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		anaEkranOlustur();
	}

	private void anaEkranOlustur() {
		cardLayout = new CardLayout();
		jPanel = new JPanel(cardLayout);
		
		JPanelGiris jPanelGiris = new JPanelGiris(cardLayout,jPanel);
		jPanel.add(jPanelGiris,"gir");
		add(jPanel);
		
		JPanelKayitEkrani jPanelKayitEkrani = new JPanelKayitEkrani(cardLayout,jPanel);
		jPanel.add(jPanelKayitEkrani, "kayit");
		add(jPanel);
		
		JPanelSayfa jPanelSayfa = new JPanelSayfa();
		jPanel.add(jPanelSayfa,"sayfa");
		add(jPanel);
		
		
		
		
	}
}
