package com.capgemini.exceptionhandling.checkedexception.customcheckedexception;

public class Person {
	public static void main(String[] args) {
		System.out.println("Main started");
		Election e1 = new Election();
		try {
			e1.vote(17);
		} catch (AgeLimitException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main ended");
	}

}

//Main started
//Age should be above 18        // when passing new ALE without any msg, it calls the overridden getMessage()
//Main ended

//Main started
//Your age should be above 18   // passing new ALE with the string msg invokes the arg cons of ALE class
//Main ended


