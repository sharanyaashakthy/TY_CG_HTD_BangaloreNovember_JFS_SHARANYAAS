package com.capgemini.exceptionhandling.checkedexception;

public class CloneNotSupportedException {
	public static void main(String[] args) {
		System.out.println("main started");
		Student s1 = new Student();
		
		
		try 
		{
			Object o1 = s1.clone();
			System.out.println("Clone is supported");
			
			//Class c1 = Class.forName("Student"); //checks in the default package
			Class c1 = Class.forName("edu.capgemini.exceptionhandling.checkedexception.Student"); //checks in the current package
			System.out.println("Class is found");
			
		} 
		catch (java.lang.CloneNotSupportedException e) 
		{
			System.out.println("Clone not supported");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found");
		}
		
		System.out.println("main ended");
	}

}

//AFTER IMPLEMENTING CLONEABLE INTERFACE IN STUDENT CLASS 
//main started
//Clone is supported
//Class is found
//main ended


//BEFORE IMPLEMENTING CLONEABLE INTERFACE IN STUDENT CLASS 
//main started
//Clone not supported
//main ended

