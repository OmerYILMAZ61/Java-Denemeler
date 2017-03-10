package com.so.swingdüzen;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AnaSayfa {

	JPanel jPanel;
	JPanel jPanelAna;
	CardLayout cardLayout;
	GirisEkrani girisEkrani;
	String kullaniciAdi ="";
	JLabel jLabel;
	String cikti = "hosgeldiniz ";

	public AnaSayfa(CardLayout cardLayout, JPanel jPanel) {
		this.cardLayout = cardLayout;
		this.jPanel = jPanel;
		
		jPanelAna = new JPanel(new BorderLayout());
		girisEkrani = new GirisEkrani();

	}

	public AnaSayfa() {
		
	}

	public void anaSayfaOlustur(){
		
		jLabel = new JLabel(cikti);
		jPanelAna.add(jLabel,BorderLayout.NORTH);
		
		JPanel jPanelText = new JPanel(new GridLayout(2, 2));
		JTextField jTextField = new JTextField(15); 
		JTextArea jTextArea = new JTextArea(10,10);
		JButton jButton = new JButton("gir");
		
		jPanelText.add(jTextField);
		jPanelText.add(jTextArea);
		jPanelText.add(new JLabel(""));
		jPanelText.add(jButton);
		
		jButton.addActionListener(new ActionListener() {
			
			
			String girdi ="";
			@Override
			public void actionPerformed(ActionEvent e) {
			girdi += jTextField.getText() + "\n";
			jTextArea.setText(girdi);
			}
		});
		
		jPanelAna.add(jPanelText,BorderLayout.CENTER);
		
		jPanel.add(jPanelAna,"ana");
		
	}

}
