package com.capgemini.accessmodifier;

public class Student {
	protected String name;
	
	protected Student(String name)
	{
		this.name = name;
	}
	
	protected void studDetails()
	{
		System.out.println("Student name is "+name);
	}

}

//class can't be declared as protected 
