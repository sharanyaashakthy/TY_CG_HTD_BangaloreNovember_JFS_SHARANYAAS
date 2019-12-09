package com.capgemini.exceptionhandling.exceptionpropogation;


//propogating the checked exceptions 
public class TestA1 {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			A1.m();
		} catch (ClassNotFoundException e) {
			System.out.println("Exception handled in TestA1");
		}
		System.out.println("main ended");
	}

}

//main started
//Exception handled in C1
//Exception handled in B1
//Exception handled in A1
//main ended
