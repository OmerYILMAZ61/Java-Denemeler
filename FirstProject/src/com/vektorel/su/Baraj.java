package com.vektorel.su;

public class Baraj extends ASu {

	@Override
	public int debi() {
		return 1000;
	}

	@Override
	public void oltaIleTutmak() {
		System.out.println("baraj'da bal�k tutmak �ok g�zel");
	}
	
	@Override
	public void tuzlulukOrani() {
		System.out.println(10 + " Barajda tuzluluk Oran�");
	}

}
