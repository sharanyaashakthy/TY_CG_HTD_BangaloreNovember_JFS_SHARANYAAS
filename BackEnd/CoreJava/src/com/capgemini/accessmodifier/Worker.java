package com.capgemini.accessmodifier;

//checking for public A.M
public class Worker {
	
	public String name;
	public static int age=23;
	
	public Worker(String name)
	{
		this.name = name;
	}
	
	public void workerDetails()
	{
		System.out.println("Worker name is "+name);
	}
	
	public static void workerAge()
	{
		System.out.println("Worker's age is "+age);
	}

}
