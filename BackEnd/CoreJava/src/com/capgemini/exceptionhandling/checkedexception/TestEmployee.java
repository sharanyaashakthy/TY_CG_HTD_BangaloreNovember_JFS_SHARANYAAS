package com.capgemini.exceptionhandling.checkedexception;

//handling two exceptions by nested try-catch blocks
public class TestEmployee {
	public static void main(String[] args) {
		System.out.println("main started");
		Employee e1 = new Employee();
		
		//nested try-catch blocks
		try {
			Object o1 = e1.clone();
			System.out.println("Clone is supported");//enters into the inner try block as the exception doesn't occur before
			try
			{
			  //Class c1 = Class.forName("edu.capgemini.exceptionhandling.checkedexception.Employee");
				Class c1 = Class.forName("Employee"); // checks in the default package
			  System.out.println("Class is found");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Class is not found");
			}
		} catch (java.lang.CloneNotSupportedException e) {
			System.out.println("Clone not supported");
		}
		
		
		System.out.println("main ended");
	}

}


//main started
//Clone is supported
//Class is not found
//main ended

