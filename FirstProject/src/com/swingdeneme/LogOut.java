package com.swingdeneme;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class LogOut {
	
	JPanel jPaneller;
	CardLayout cardLayout;

	public LogOut(CardLayout cardLayout,JPanel jPaneller) {
		this.cardLayout = cardLayout;
		this.jPaneller = jPaneller;
	}
	public void logOutYap(){
		cardLayout.show(jPaneller, "tablo");
	}
	
	
	
}
