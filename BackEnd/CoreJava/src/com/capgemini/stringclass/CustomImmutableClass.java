package com.capgemini.stringclass;

public class CustomImmutableClass {
	private String name;
	private int age;
	
	public CustomImmutableClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		CustomImmutableClass c = new CustomImmutableClass("John", 25);
		System.out.println(c.getName());
		System.out.println(c.hashCode());
		System.out.println(c.getAge());
		
		c = new CustomImmutableClass("Michael", 24);
		System.out.println(c.hashCode());
	}
}

/*
John
366712642
25
1829164700
 
 */ 
