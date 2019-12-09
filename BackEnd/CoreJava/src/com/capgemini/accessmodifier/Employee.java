package com.capgemini.accessmodifier;

//default access modifiers for the class, var, method & constructor.
 class Employee {
	String name;
	
	 Employee(String name) {
		this.name = name;
	}
	
	void empDetails()
	{
		System.out.println("Employee name = "+name);
	}
	

}
