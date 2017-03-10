package com.swingdeneme;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
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
	JPanel jPanel;
	JPanel jPanelkayit;
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
	JButton jButtonCikis;
	JButton jButtonKayit;
	Kisi kisi;
	String myText = "" ;
	
	public MyFrame() {
		setSize(200, 200);
		setLocationRelativeTo(null);
		govdeOlustur();
		jPanelSayfaOlustur();
		jPanelTabloOlustur();
		girisKontrol();
		//kayitOl();
		cikisYap();
	}
	
//	public void kayitOl() {
//		KayitOl kayitOl = new KayitOl(jPaneller,cardLayout,jPanelTablo);
//		
//	}

	public void cikisYap() {
		
		
		jButtonCikis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LogOut logOut = new LogOut(cardLayout, jPaneller);
				logOut.logOutYap();
			}
		});

		
	}

	public void govdeOlustur(){
		
		jPanel = new JPanel(new BorderLayout());
		jPanelkayit = new JPanel(new FlowLayout());
		cardLayout = new CardLayout();
		jPaneller = new JPanel(cardLayout);
		jPanelTablo = new JPanel(new GridLayout(3, 3));
		jPanelSayfa = new JPanel(new BorderLayout());
		
		jPaneller.add(jPanelTablo,"tablo");
		jPaneller.add(jPanelSayfa,"sayfa");
		
		jPanel.add(jPaneller,BorderLayout.CENTER);
		
		add(jPanel);
		
	}
	
	public void jPanelTabloOlustur(){
		
		jPanel.add(new JLabel("daha kayit olamdýnýz mý ?"), BorderLayout.NORTH);
		
		jButtonKayit = new JButton("kayit ol");
		jPanel.add(jButtonKayit,BorderLayout.NORTH);
		
		jPanelTablo.add(new JLabel("Kullanýcý Adý"));
		
		jTextField1 = new JTextField(15);
		jPanelTablo.add(jTextField1);
		
		jPanelTablo.add(new JLabel("Þifre"));

		jTextField2 = new JTextField(15);
		jPanelTablo.add(jTextField2);
		
		jButtonGir = new JButton("Giriþ");
		jButtonGir.setBackground(new Color(255, 0, 0));
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
		
		jButtonCikis = new JButton("çýkýþ");
		jPanelSayfa.add(jButtonCikis,BorderLayout.SOUTH);
		
		
		
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
