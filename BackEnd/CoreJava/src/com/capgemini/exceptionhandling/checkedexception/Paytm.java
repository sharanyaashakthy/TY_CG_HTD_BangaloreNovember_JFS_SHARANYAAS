package com.capgemini.exceptionhandling.checkedexception;

public class Paytm {
	Irctc i1;
	Paytm(Irctc i1)
	{
		this.i1 = i1;
	}
	
	void bookTicket()
	{
		try {
			i1.confirmTicket();
			System.out.println("Paytm--->Ticket is confirmed ");
		} catch (ClassNotFoundException e) {
			System.out.println("Paytm-->Ticket is confirmed ");
		}
	}

}
