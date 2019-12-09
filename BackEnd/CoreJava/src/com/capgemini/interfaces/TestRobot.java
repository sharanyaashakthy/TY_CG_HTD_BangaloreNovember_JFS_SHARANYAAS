package com.capgemini.interfaces;

public class TestRobot 
{
	public static void main(String[] args)
	{
		Robot r = new Robot();
		r.move();
		r.sound();
		
		System.out.println("----------------------");
		//Parent-interface etype reference variable 
		//run-time polymorphism
		Move m = new Robot();
		m.move();
		
		System.out.println("----------------------");
		//sub-interface type reference variable
		//run-time polymorphism
		Talk t = new Robot();
		t.sound();
		t.move();
	}

}
/*
Robot moves
Robot talks
----------------------
Robot moves
----------------------
Robot talks
Robot moves

 */

