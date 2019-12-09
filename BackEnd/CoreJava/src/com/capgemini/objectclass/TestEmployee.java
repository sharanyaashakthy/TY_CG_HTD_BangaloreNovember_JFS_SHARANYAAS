package com.capgemini.objectclass;

public class TestEmployee 
{
	public static void main(String[] args)
	{
		
		Employee e = new Employee(01, "Shakthy");
		Employee e1 = new Employee(02, "Sharan");
		
		//invoking the overridden toString() 
		System.out.println(e.toString());
		System.out.println(e);
		System.out.println(e1.toString());
		System.out.println(e1);
		
        //invoking the hashcode()
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		
		Object o = new Object();
		
	}

}
//Employee [empId=1, empName=Shakthy]
//Employee [empId=1, empName=Shakthy]
//Employee [empId=2, empName=Sharan]
//Employee [empId=2, empName=Sharan]
//366712642
//1829164700