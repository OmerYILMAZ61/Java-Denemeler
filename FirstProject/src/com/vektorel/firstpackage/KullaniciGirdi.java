package com.vektorel.firstpackage;

import java.util.Scanner;

public class KullaniciGirdi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Ka� rakam girmek istiyorsunuz?");
		int rakamSayisi = scanner.nextInt();
		
		int toplam = 0;
		
		for (int i = 0; i < rakamSayisi; i++) {
			System.out.println((i+1) + ". rakam� giriniz : ");
			toplam += scanner.nextInt();
		}
		System.out.println("Girdi�iniz rakamlar toplam� = " + toplam);

	}

}
