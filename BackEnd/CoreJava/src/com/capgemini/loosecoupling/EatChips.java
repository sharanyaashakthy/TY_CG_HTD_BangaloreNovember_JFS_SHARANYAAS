package com.capgemini.loosecoupling;

public class EatChips {
	void feed( Chips c)//loosely coupled since it is accepting the parent class type
	{
		c.open();
		c.eat();
		
	}
}
