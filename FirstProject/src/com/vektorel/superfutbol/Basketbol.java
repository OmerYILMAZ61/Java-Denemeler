package com.vektorel.superfutbol;

public class Basketbol extends Spor {
	

//	public Basketbol(){
////		super("Basketbol");
//		System.out.println("Basketbol S�n�f�");
//	}
	
	@Override
	public void topRenginiSoyle() {
		// TODO Auto-generated method stub
		setTopRengi("Kahverengi");
		System.out.println("**@Override topRenginiSoyle** Top rengim " + getTopRengi());
		//super.topRenginiSoyle("Siyahi Arkada�lar Geldi");
	}
	

	
}
