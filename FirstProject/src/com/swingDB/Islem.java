package com.swingDB;

public class Islem {
	static MyFrame myFrame;
	public static void main(String[] args) {
		myFrame = new MyFrame();
		myFrame.setVisible(true);
	}
	
	public static void cikis(){
		myFrame.dispose();
	}
}
