package com.vektorel.hatalar;

public class ArrayIslem {

	public static void main(String[] args) {
		
		int[] hataliList = new int[3];
		
		try{
			
			hataliList[0] = 10;
			hataliList[1] = 20;
			hataliList[2] = 30;
			
			System.out.println("Hata �ncesi");

			
			hataliList[3] = 40;
			
			System.out.println("Hata sonras�");

			
		}catch (Exception e) {
			System.out.println("Bir �eyler "
					+ "yanl�� gidiyor be dostum");
			
			e.printStackTrace();

		}
		
		System.out.println("Her�ey Yolunda");

	}

}
