package com.capgemini.exceptionhandling;

//throw keyword and checking the exception propogation
public class GoogleMap {
	void findLocation(String loc)
	{
		try {
			System.out.println(loc.length());
		} catch (NullPointerException n) {
			System.out.println("Google user---> fill the proper location kindly");
			throw n;
		}
	}

}
