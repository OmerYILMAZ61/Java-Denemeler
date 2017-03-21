package com.so.swingdüzen;

public class Islem {

	static MyEkran myEkran;
	
	public static void main(String[] args) {
		myEkran = new MyEkran();
		myEkran.setVisible(true);
	}
	
	public static void ekranKapa() {
		myEkran.setVisible(false);
	}
}
