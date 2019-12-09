package com.capgemini.interfaces;

public class Robot implements Move, Talk {
	public void move()
	{
		System.out.println("Robot moves");
	}
	public void sound()
	{
		System.out.println("Robot talks");
	}
	

}
