package com.capgemini.interfaces;

public class BottlePepsi implements Bottle {
	public void open()
	{
		System.out.println("Open Pepsi");
	}
	public  void drink()
	{
		System.out.println("Drink Pepsi");
	}
	
	//overriding juice of Bottle Interface
	public void juice()
	{
		System.out.println("Pepsi juice");
	}

}
