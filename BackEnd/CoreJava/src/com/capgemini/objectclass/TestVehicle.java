package com.capgemini.objectclass;

public class TestVehicle {
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle v1  = new Vehicle("Car");
		Object o1 = v1.clone();
		System.out.println(o1);
		
		Vehicle v2 =  (Vehicle)o1;//downcasting Object class type to vehicle type 
		System.out.println(v2.name);
		
	}

}

/*
 edu.capgemini.objectclass.Vehicle@15db9742
Car
 */
