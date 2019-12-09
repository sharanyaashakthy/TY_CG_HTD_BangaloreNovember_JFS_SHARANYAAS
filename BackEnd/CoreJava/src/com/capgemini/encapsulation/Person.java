package com.capgemini.encapsulation;

import java.io.Serializable;


//java bean class - example of encapsulation 

public class Person implements Serializable {
	private int age;
	private String name;
	
	public Person(int age, String name)
	{
		this.age = age;
		this.name = name;
		
	}
	
	public Person() {
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	public String getName()
	{
		return this.name;
	}

}
