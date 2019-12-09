package com.capgemini.objectclass;

public class Student 
{
	int studId;
	String studName;
	
	public Student(int studId, String studName)
	{
		super();
		this.studId = studId;
		this.studName = studName;
	}

	//overriding the toString()
	public String toString()
	{
		return "Student name "+ studName + "  Student Id "+studId;
		
		
	}

}
