package com.capgemini.exceptionhandling.checkedexception;

public class Irctc {
	void confirmTicket() throws ClassNotFoundException
	{
		try {
			Class c1 = Class.forName("edu.capgemini.exceptionhandling.checkedexception.customcheckedexception.Paytm");
			System.out.println("IRCTC---> Ticket is confirmed ");
		} catch (ClassNotFoundException e) {
			System.out.println("IRCTC---> Ticket is not confirmed ");
			throw e;
		}
	}

}
