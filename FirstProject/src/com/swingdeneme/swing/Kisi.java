package com.swingdeneme.swing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kisi {

	private String adi;
	private String sifre ;
	Scanner sc;
	
	public Kisi(String path) {
		File file = new File(path);
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Boolean kisiKayitlimi(String kullaniciAdi, String sifre) {
			while(sc.hasNextLine()){
				if(sc.next().equals(kullaniciAdi)&&sc.next().equals(sifre)){
					return true;
				}
			}
			return false;
	}
	
	
	
	
}
