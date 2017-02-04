package com.vektorel.overloading;

public class Araba {
	
	Volvo volvo;
	
	
	public Araba(int arabaId){
		System.out.println("araba int id:"+arabaId +" nesnesi olu�turuldu");
	}
	
	public Araba(double arabaId){
		System.out.println("araba double:"+arabaId +" nesnesi olu�turuldu");
	}
	
	public Araba(String arabaId){
		System.out.println("araba String:"+arabaId +" nesnesi olu�turuldu");
	}
	
	public Araba(){
		System.out.println("Araba Nesnesi Olu�turuldu");
	}
	
	protected Araba(int id,String name){
		System.out.println("int iki parametreli id:"+ id + "name:"+name);
	}
	
	protected Araba(String id,String name){
		System.out.println("string iki parametreli id:"+ id + "name:"+name);
	}
	
	public Araba(Volvo volvo){
		System.out.println("Volvo tipinde nesne �ratildi");
	}
	public Araba(Fiat fiat){
		System.out.println("Fiat tipinde nesne �ratildi");
	}
	public Araba(Toyota toyota){
		System.out.println("Araba Class� Toyota tipinde nesne �ratildi");
	}

	public Araba(Fiat isimliFiatNesnesi, Volvo volvo) {
		this.volvo = volvo;
		//		System.out.println("iki parametreli volvo,fiat nesnesi olu�tu");
		System.out.println("Fiat id:"+isimliFiatNesnesi.getId()
							+"-- name:"+isimliFiatNesnesi.getName());
		
		System.out.println("Volvo id:"+volvo.getId()
		+"-- name:"+volvo.getName());
		
	}
	
	public void setVolvo(Volvo volvo) {
		this.volvo = volvo;
	}
	
	public Volvo getVolvo() {
		return volvo;
	}
	
	

	

}
