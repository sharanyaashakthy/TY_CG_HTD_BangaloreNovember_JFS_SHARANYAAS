package com.capgemini.exceptionhandling.checkedexception;

public class ClassnotFoundException {
	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			Class c1 = Class.forName("edu.capgemini.exceptionhandling.checkedexception.Person");
			System.out.println("Class is found");
		} catch (ClassNotFoundException e) {
			System.out.println("Class is not found");
		}
		System.out.println("Main ended");
	}

}


//BEFORE CREATING THE CLASS IN THIS PACKAGE
//Main started
//Class is not found
//Main ended

//AFTER CREATING THE CLASS IN THIS PACKAGE
//Main started
//Class is found
//Main ended


