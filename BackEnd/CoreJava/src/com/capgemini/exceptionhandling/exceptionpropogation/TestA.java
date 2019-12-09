package com.capgemini.exceptionhandling.exceptionpropogation;


//Exception propogation
public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			A.o();
		} catch (ArithmeticException e) {
			System.out.println("TestA main---> "+e.getMessage());
			
		}
		System.out.println("main ended");
	}

}

//main started
//C class---> / by zero
//B class---> / by zero
//A class---> / by zero
//TestA main---> / by zero
//main ended
