package com.capgemini.exceptionhandling;


//finally block will always be executed 
public class Exception3 {
	public static void main(String[] args) {
		System.out.println("main started");
		try 
		{
			System.out.println(500/0);
		} 
		catch (ArithmeticException e)
		{
			System.out.println("don't divide with zero");
		}
		finally
		{
			System.out.println("finally block called");
		}
		System.out.println("main ended");
	}

}
//main started
//don't divide with zero
//finally block called
//main ended

