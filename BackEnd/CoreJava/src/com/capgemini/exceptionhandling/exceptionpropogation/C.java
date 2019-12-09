package com.capgemini.exceptionhandling.exceptionpropogation;

public class C {
	static void m()
	{
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("C class---> "+e.getMessage());
			throw e;//explicitly throwing the exception back to the calling method
		}
	}

}
