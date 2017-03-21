package com.so.swingdüzen;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KayitOl {

	CardLayout cardLayout;
	JPanel jPanel;
	JPanel jPanelKay;
	String path;


	public KayitOl(CardLayout cardLayout, JPanel jPanel, String path) {
		this.cardLayout = cardLayout;
		this.jPanel = jPanel;
		this.path = path;

	}

	public void kayitEkraniOlustur() {
		jPanelKay = new JPanel(new GridLayout(3, 3));

		JLabel jLabel1 = new JLabel("kullanici adi seçin");

		JTextField jTextField = new JTextField(15);

		JLabel jLabel2 = new JLabel("sifre seçin");

		JTextField jTextField2 = new JTextField(15);
		
		JButton jButtonKayitOl = new JButton("kaydol");
		
		jPanelKay.add(jLabel1);
		jPanelKay.add(jTextField);
		jPanelKay.add(jLabel2);
		jPanelKay.add(jTextField2);
		jPanelKay.add(new JLabel(""));
		jPanelKay.add(jButtonKayitOl);
		
		jPanel.add(jPanelKay,"kayit");
		
		jButtonKayitOl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String kullaniciAdi = "\r\n"+jTextField.getText() +" ";
				String sifre = jTextField2.getText();
				File file = new File(path);
				try {
					
					FileOutputStream fos = new FileOutputStream(file,true);
					fos.write(kullaniciAdi.getBytes());
					fos.write(sifre.getBytes());
					
					fos.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				cardLayout.show(jPanel, "giris");
			}
		});

	}

}
