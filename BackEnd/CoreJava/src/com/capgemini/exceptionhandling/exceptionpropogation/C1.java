package com.capgemini.exceptionhandling.exceptionpropogation;

public class C1 {
	public static void o() throws ClassNotFoundException
	{
		try
		{
			Class c1  = Class.forName("C1");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception handled in C1");
			throw e;
		}
		
		
	}

}
