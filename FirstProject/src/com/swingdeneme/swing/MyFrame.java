package com.swingdeneme;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	JPanel jPanelAna;
	CardLayout cardLayout;
	JPanel jPaneller;
	JPanel jPanelTablo;
	JPanel jPanelSayfa;
	JTextField jTextField1;
	JTextField jTextField2;
	JTextField jTextFieldSayfa;
	JTextArea jTextArea;
	JButton jButtonGir;
	JButton jButtonUnuttum;
	Kisi kisi;
	String myText = "" ;
	
	public MyFrame() {
		setSize(200, 200);
		setLocationRelativeTo(null);
		govdeOlustur();
		jPanelSayfaOlustur();
		jPanelTabloOlustur();
		girisKontrol();
	}
	
	public void govdeOlustur(){
		
		cardLayout = new CardLayout();
		jPaneller = new JPanel(cardLayout);
		jPanelTablo = new JPanel(new GridLayout(3, 3));
		jPanelSayfa = new JPanel(new BorderLayout());
		
		
		jPaneller.add(jPanelTablo,"tablo");
		jPaneller.add(jPanelSayfa,"sayfa");
		
		
		add(jPaneller);
		
	}
	
	public void jPanelTabloOlustur(){
		jPanelTablo.add(new JLabel("Kullanýcý Adý"));
		
		jTextField1 = new JTextField(15);
		jPanelTablo.add(jTextField1);
		
		jPanelTablo.add(new JLabel("Þifre"));

		jTextField2 = new JTextField(15);
		
		jPanelTablo.add(jTextField2);
		
		jButtonGir = new JButton("Giriþ");
		jPanelTablo.add(jButtonGir);
		
		jButtonUnuttum = new JButton("Þifremi unuttum");
		jPanelTablo.add(jButtonUnuttum);
	}
	
	public void jPanelSayfaOlustur(){
		jPanelSayfa.add(new JLabel("girdiniz hoþgeldiniz"),BorderLayout.NORTH);
		JPanel jPanels = new JPanel(new GridLayout(2, 2));
		
		jTextFieldSayfa = new JTextField(15);
		jTextArea = new JTextArea(10,10);
		JButton jButton = new JButton("gir");
		
		jPanels.add(jTextFieldSayfa);
		jPanels.add(jTextArea);
		jPanels.add(new JLabel(""));
		jPanels.add(jButton);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myText += "\n"+jTextFieldSayfa.getText();
				jTextArea.setText(myText);
				jTextFieldSayfa.selectAll();
				
			}
		});
		
		jPanelSayfa.add(jPanels,BorderLayout.CENTER);
		
		
		
		
	}
	
	public void girisKontrol(){
		
		jButtonGir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Kisi kisi = new Kisi("D:/ödevDosyasý/login kisi/kisiler.txt");
				
				if(kisi.kisiKayitlimi(jTextField1.getText(), jTextField2.getText())){
					Giris giris = new Giris();
					cardLayout.show(jPaneller, "sayfa");
				}
				else{
					Hata hata = new Hata();
				}
			}
		});
	}
	
}
