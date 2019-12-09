package com.capgemini.interfaces;

public class Car {
	
	
	//zero parameters 
//	Vehicle v1 = ()-> {
//		System.out.println("Car is moving");
//	};
	
	
	//one parameter, paranthesis not required 
//	Vehicle v1 = a ->{
//		System.out.println("Car");
//	};
	
	
	//two parameters, paranthesis is mandatory
	//flower braces isn't reqd.
	Vehicle v1 = (a,b) ->System.out.println("car moves");
	
	

}
