package com.capgemini.accessmodifier;

public class Person {
	
	private String name;
	
	//before it was private
	 Person(String name)
	{
		this.name = name;
	}
	
	// before it was private
	 void details()
	{
		System.out.println("Name "+name);
	}

}
