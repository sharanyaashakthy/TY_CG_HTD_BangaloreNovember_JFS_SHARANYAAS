package com.capgemini.objectclass;

public class TestPen
{
	public static void main(String[] args) {
		Pen p = new Pen();
		p.write();
		
		//calling the toString() of Object class
		System.out.println(p.toString());
	}

}

//Writing
//edu.capgemini.objectclass.Pen@15db9742
