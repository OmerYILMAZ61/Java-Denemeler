package com.so.swingdüzen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginKontrol {
	String path ;
	public LoginKontrol(String path) {
		this.path = path;
	}
	
	public Boolean kontrolEt(String kullaniciAdi, String sifre){
		
		File file = new File(path);
		try {
			Scanner sc = new Scanner(file);
			String adi,sifree;
			
			while(sc.hasNextLine()){
				
				adi = sc.next(); 
				sifree = sc.next();
				
				if(adi.equals(kullaniciAdi)&&sifree.equals(sifre)){
					return true;
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
}
