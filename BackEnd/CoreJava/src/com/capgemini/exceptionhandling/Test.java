package com.capgemini.exceptionhandling;

public class Test {
	public static void main(String[] args) {
		System.out.println("MMS");
		int a[] = new int[2];
		a[0] = 0;
		a[1] = 1;
		try 
		{
			a[2] = 2;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("no storage to store 2");
		}
		
		
		System.out.println("MME");
	}

}
//MMS
//no storage to store 2
//MME
