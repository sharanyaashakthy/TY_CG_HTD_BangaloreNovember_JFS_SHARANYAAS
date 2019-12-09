package com.capgemini.exceptionhandling;

public class Ola {
	GoogleMap g1;
	Ola(GoogleMap g1)
	{
		this.g1 = g1;
	}
	void find(String loc)
	{
		try {
			g1.findLocation(loc);
		} catch (NullPointerException e) {
			System.out.println("Ola user---> fill the proper location kindly");
		}
	}

}
