package com.capgemini.objectclass;

public class TestPerson {
	public static void main(String[] args) throws Throwable {
		
		System.out.println("Main method started");
		Person p = new Person("John");
		p.finalize(); //finalize method is called
		
		p = null;
		System.gc(); //finalize method is called
		System.out.println("Main method ended");
		
	}

}
/*
Main method started
finalize method is called
Main method ended
finalize method is called
 */ 
