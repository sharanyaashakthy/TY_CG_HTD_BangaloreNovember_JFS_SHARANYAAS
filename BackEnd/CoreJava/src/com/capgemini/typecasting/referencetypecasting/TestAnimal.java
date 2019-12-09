package com.capgemini.typecasting.referencetypecasting;

public class TestAnimal {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();
		
		System.out.println("-----------------------------");
		//implicit upcasting and using a1, only the super class props. can be accessed
		Animal a1 = new Dog();
		a1.eat();
		
		System.out.println("-----------------------------");
		//downcasting on an upcasted object and is explicit, both the animal & dog class can be accessed
		Animal a2 = new Dog();
		Dog d = (Dog) a2;
		d.eat();
		d.bark();
		
		System.out.println("-----------------------------");
		//downcasting on an upcasted object and is explicit, both the animal & lion class can be accessed
		Animal a3 = new Lion();
		Lion l = (Lion)a3;
		l.eat();
		l.roar();
	}
/*
Animal eats
-----------------------------
Animal eats
-----------------------------
Animal eats
Dog barks
-----------------------------
Animal eats
Lion roars
*/

}
