package com.vektorel.superfutbol;

public class PlajVoleybol extends Voleybol {
	
	
	public PlajVoleybol(){
		super();
		System.out.println("Plaj S�n�f�");
	}
	
	public void takiminiSoyle(){
		setTak�m("pon�ik k�zlar");
		System.out.println(getTak�m());
		super.kacKisiyiz(5);
	}

}
