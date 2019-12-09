package com.capgemini.abstractkeyword;

public class TestAnimal {
	public static void main(String[] args) {
		ChildAnimal c = new ChildAnimal("Pinky");
		System.out.println(c.name);
		
		System.out.println("----------------------");
		
		Animal a = new ChildAnimal("Jimmy");
		System.out.println(a.name);
	}

}

/*
 Pinky
---------------------------------
Jimmy
*/
