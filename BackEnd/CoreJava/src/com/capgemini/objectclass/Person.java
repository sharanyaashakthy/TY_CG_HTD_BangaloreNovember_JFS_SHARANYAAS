package com.capgemini.objectclass;


//protected void finalize()

//refer------------>TestPersonDemo----> same package(objectclass)
//also refer -----> TestPersonDemoOne ------> different package(typecasting)


public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	
	//must  be overridden
	@Override
	
	//protected void finalize() throws Throwable {//TestPersonDemo
	public void finalize() throws Throwable {//TestPersonDemoOne
		super.finalize();
		System.out.println("finalize method is called");
	}

}
