package com.vektorel.kalitim3;

public class Islem {

	public static void main(String[] args) {
		
		HızArabasi hızArabasi =new HızArabasi();
		
		hızArabasi.setModel(2017);
		hızArabasi.setMotorGucu(2000.0);
		hızArabasi.setMarkasi("Ferari");
		
		hızArabasi.setTurboMiktari(5000);
		hızArabasi.setAksesuar("rüzgarlık");
		
		
		hızArabasi.hareket();
		
		
		
	}
}
