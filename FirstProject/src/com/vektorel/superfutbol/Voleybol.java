package com.vektorel.superfutbol;

public class Voleybol extends Spor {
	
	static String degisken = "Voleybol";
	
	public void kacKisiyiz(int i) {
		super.kacKisiyiz(i);
		System.out.println("Voleybol -Bu kadar pon�ik k�z�z :" + i);
	}
	
	public static void neredeyiz(){
		System.out.println("berlin'deyiz");
	}
	
	

}
