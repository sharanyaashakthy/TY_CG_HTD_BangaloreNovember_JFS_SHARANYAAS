package com.capgemini.accessmodifier;

// all those can be accessed outside the class and within the same package 
// when this TestEmployee class is created in the other package, the properties of the Employee 
//class can't be accessed 


public class TestEmployee {
	public static void main(String[] args)
	{
		Employee e = new Employee("Shakthy");	
		e.empDetails();
	}

}
//Employee name = Shakthy

