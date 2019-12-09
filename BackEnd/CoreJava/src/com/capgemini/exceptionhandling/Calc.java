package com.capgemini.exceptionhandling;

public class Calc {
	void divide(int a, int b)
	{
		try
		{
			System.out.println("divide() called");
			System.out.println(a/b);
			System.out.println("divide() ended");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
