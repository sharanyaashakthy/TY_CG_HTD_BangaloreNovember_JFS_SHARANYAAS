package com.capgemini.abstractkeyword;

public class TestVehicle {
	public static void main(String[] args) {
		ChildVehicle c = new ChildVehicle();
		c.start();
		c.stop();
		System.out.println("---------------------------");
		Vehicle v = new ChildVehicle();
		v.start();
		v.stop();//this can also be accessed, bcos it is already present and declared in the parent class
	}
}

/*
 * Start vehicle
Stop vehicle
---------------------------
Start vehicle
Stop vehicle
 */
 