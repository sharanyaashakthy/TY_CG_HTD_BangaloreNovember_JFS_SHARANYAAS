package com.capgemini.exceptionhandling.exceptionpropogation;

public class A {
	static void o()
	{
		try {
			B.n();
		} catch (ArithmeticException e) {
			System.out.println("A class---> "+e.getMessage());
			throw e;
		}
	}

}
