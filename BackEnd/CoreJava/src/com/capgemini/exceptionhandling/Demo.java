package com.capgemini.exceptionhandling;

public class Demo {
	
	void write()
	{
		String s = null;
		try
		{
			System.out.println("length of the string is "+s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception, don't deal with null");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("MMS");
		Demo d = new Demo();
		d.write();
		System.out.println("MME");
	}
}

//MMS
//Null pointer exception, don't deal with null
//MME

