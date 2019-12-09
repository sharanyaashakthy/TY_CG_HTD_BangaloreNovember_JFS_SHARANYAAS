package com.capgemini.exceptionhandling.exceptionpropogation;

public class A1 {
	static void m() throws ClassNotFoundException
	{
		try {
			B1.n();
		} catch (ClassNotFoundException e) {
			System.out.println("Exception handled in A1");
		}
	}

}
