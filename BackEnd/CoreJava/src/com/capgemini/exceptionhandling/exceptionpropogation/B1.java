package com.capgemini.exceptionhandling.exceptionpropogation;

public class B1 {
	public static void n() throws ClassNotFoundException
	{
		try
		{
			C1.o();
		}
		
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception handled in B1");
			throw e;
		}
	}

}
