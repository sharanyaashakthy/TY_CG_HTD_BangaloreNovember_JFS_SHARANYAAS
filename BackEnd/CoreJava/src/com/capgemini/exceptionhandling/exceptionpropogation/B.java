package com.capgemini.exceptionhandling.exceptionpropogation;

public class B {
	static void n()
	{
		try {
			C.m();
		} catch (ArithmeticException e) {
			System.out.println("B class---> "+e.getMessage());
			throw e;//explicitly throwing the exception back to the calling method
		}
	}

}
