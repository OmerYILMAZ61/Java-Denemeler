package com.vektorel.kalitim3;

public class Islem {

	public static void main(String[] args) {
		
		H�zArabasi h�zArabasi =new H�zArabasi();
		
		h�zArabasi.setModel(2017);
		h�zArabasi.setMotorGucu(2000.0);
		h�zArabasi.setMarkasi("Ferari");
		
		h�zArabasi.setTurboMiktari(5000);
		h�zArabasi.setAksesuar("r�zgarl�k");
		
		
		h�zArabasi.hareket();
		
		
		
	}
}
