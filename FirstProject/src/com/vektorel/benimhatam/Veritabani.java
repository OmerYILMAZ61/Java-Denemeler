package com.vektorel.benimhatam;

import java.net.ConnectException;

public class Veritabani {
	
	public void baglan() throws ConnectException, NullPointerException{
		throw new ConnectException("Veritaban� yok");
	}
	
	public void islemYap(){
		try {
			baglan();
		} catch (ConnectException e) {
			e.printStackTrace();
		}
	}
	

}
