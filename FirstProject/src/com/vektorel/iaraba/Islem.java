package com.vektorel.iaraba;

public class Islem {

	public static void main(String[] args) {
//		IAraba volvo = new Volvo();
//		IAraba fiat = new Fiat();
//		
//		volvo.fren();
//		
//		fiat.fren();
//		
//		IVolvoTamirci volvoTamir = new Volvo();
//		volvoTamir.frenTamir();
//		
		IKaporta kaportaVolvo = new Volvo();
		
		IKaporta kaportaFiat = new Fiat();
		
		kaportaVolvo.boya("k�rm�z�");
		kaportaFiat.boya("beyaz");

	}
	
}
