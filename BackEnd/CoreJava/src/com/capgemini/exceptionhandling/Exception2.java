package com.capgemini.exceptionhandling;

//nested try block to handle all the exceptions
public class Exception2 {

		void exception(int a, String b)
		{
			try
			{
				System.out.println(500/a);
				try
				{
					System.out.println(b.length());
				} 
				catch (NullPointerException e) 
				{
					System.out.println("don't assign null");
				}
			} 
			catch (ArithmeticException e)
			{
				System.out.println("don't divide with zero");
			}
			
		}
		public static void main(String[] args) {
			System.out.println("main started");
			Exception1 e1 = new Exception1();
			e1.exception(0, "Ram");
			
			System.out.println("********************************");
			Exception1 e2 = new Exception1();
			e2.exception(2, null);
			System.out.println("main ended");
		}
}
//main started
//don't divide with zero
//3
//********************************
//250
//don't assign null
//main ended
