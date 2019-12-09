package com.capgemini.exceptionhandling.checkedexception;

//User, Paytm, irctc Classes

public class User {
	public static void main(String[] args) {
		System.out.println("main started");
		
		Irctc i1 = new Irctc();
		Paytm p1 = new Paytm(i1);
		p1.bookTicket();
		
		
		System.out.println("main ended");
	}

}


//main started
//IRCTC---> Ticket is confirmed 
//Paytm--->Ticket is confirmed 
//main ended
