package com.capgemini.collection.set.treeset;

public class Emp implements Comparable<Emp> {
	
	String name;
	int age;
	int salary;
	public Emp(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	
	//SORTING BASED ON AGE
//	public int compareTo(Emp o) {
//		if(this.age > o.age)
//			return 1;
//		else if(this.age < o.age)
//			return -1;
//		else
//			return 0;
//	}
	
	//SORTING BASED ON SALARY
//	public int compareTo(Emp o) {
//		if(this.salary > o.salary)
//			return 1;
//		else if(this.salary < o.salary)
//			return -1;
//		else
//			return 0;
//	}
	
	
	//SORTING BASED ON NAME
	public int compareTo(Emp o)
	{
		return this.name.compareTo(o.name);
	}
	
	

}
