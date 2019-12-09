package com.capgemini.exceptionhandling.uncheckedexception.customunchecked;

public class Atm {
	public static void main(String[] args) {
		System.out.println("main started");
		Bank b = new Bank();
		
		try {
			b.withdraw(45000);
		} catch (DayLimitException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main ended");	
	}

}

//main started
//User exceeds day limit exception
//main ended

