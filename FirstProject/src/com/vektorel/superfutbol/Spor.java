package com.vektorel.superfutbol;

public class Spor {
	
	final double PI = 3.5;
	
	private String tak�m;
	protected String topRengi = "Beyaz";
	
	
	final public void hangiSahadasin(final String sahaIsmi){
		
		System.out.println("sahaismi" + sahaIsmi);
		
	}
	
	public void hangiSahadasin(final double sahaIsmi){
		
		System.out.println("sahaismi" + sahaIsmi);
		
	}
	
	
	public void hangiSahadasin(final String sahaIsmi, String ikinci){
		
		System.out.println("sahaismi" + sahaIsmi);
		
	}
	
	
	final public void hakemVar(){
		System.out.println("Spor - Hakem");
	}
	

	public Spor (){
		System.out.println("Spor S�n�f�");
	}
	
	public Spor(String value){
		System.out.println("Spor s�n�f� Deger:"+value);
	}
	
	public void kacKisiyiz(int i) {
		System.out.println("Bu kadar pon�ik k�z�z :" + i);
	}
	
	
	public void takiminiSoyle(){
		System.out.println("tak�m "+ this.tak�m);
	}
	
	public void topunSekiliniSoyle(){
		System.out.println("Top karedir");
	}
	
	public void topRenginiSoyle(){
		System.out.println("top Rengi "+ this.topRengi);

	}
	
	public void topRenginiSoyle(String value) {
		System.out.println("**spor**"+value);
		System.out.println("**spor**"+"Siz ne isterseniz olur abi");
		
	}
	
	
	

	public String getTak�m() {
		return tak�m;
	}

	public void setTak�m(String tak�m) {
		this.tak�m = tak�m;
	}

	public String getTopRengi() {
		return topRengi;
	}

	public void setTopRengi(String topRengi) {
		this.topRengi = topRengi;
	}

	
}
