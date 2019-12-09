package com.capgemini.exceptionhandling;

public class TestGoogleOla {
	public static void main(String[] args) {
		System.out.println("main started");
		GoogleMap g1 = new GoogleMap();
		Ola o1 = new Ola(g1);
		//Exception line since null value is passed to find the length of null
		o1.find(null);
		System.out.println("main ended");
	}

}
//main started
//Google user---> fill the proper location kindly
//Ola user---> fill the proper location kindly
//main ended
