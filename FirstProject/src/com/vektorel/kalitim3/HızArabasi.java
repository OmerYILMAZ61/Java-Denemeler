package com.vektorel.kalitim3;

public class H�zArabasi extends Araba {
	int turboMiktari;
	String aksesuar;
	
	void turboYap(){
		System.out.println("H�zarabas� - turboYap()");
	}
	

	@Override
	public void hareket() {
		System.out.println("H�zArabas� - hareket()");
	}
	
	public void motorGucuDegistir(){
		
	}

	
	
	public int getTurboMiktari() {
		return turboMiktari;
	}


	public String getAksesuar() {
		return aksesuar;
	}


	public void setTurboMiktari(int turboMiktari) {
		this.turboMiktari = turboMiktari;
	}


	public void setAksesuar(String aksesuar) {
		this.aksesuar = aksesuar;
	}


}
