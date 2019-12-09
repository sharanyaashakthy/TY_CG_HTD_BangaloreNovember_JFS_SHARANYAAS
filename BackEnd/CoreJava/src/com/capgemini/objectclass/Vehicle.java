package com.capgemini.objectclass;

//protected object Clone()
public class Vehicle implements Cloneable {
	String name;

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	//must override clone() when using it
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
