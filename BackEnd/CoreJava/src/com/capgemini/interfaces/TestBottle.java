package com.capgemini.interfaces;

public class TestBottle extends BottleFanta
{
	public static void main(String[] args)
	{
		
		//accessing the BottleFanta methods
		BottleFanta b = new BottleFanta();
		b.open();
		b.drink();
		
		//accessing the BottlePepsi methods
		BottlePepsi b1 = new BottlePepsi();
		b1.open();
		b1.drink();
		b1.juice();// Pepsi juice bcoz, it has overridden juice()
		
		//accessing the default methods which gets inherited to all impln classes
		b.juice();//fanta juice
		b1.juice();//pepsi juice
		
		//accessing the static method by using the interface name
		Bottle.close();
		
		
		
	   
		
	}

}
/*
Open Fanta
Drink Fanta
Open Pepsi
Drink Pepsi
Pepsi juice
Fanta Juice
Pepsi juice
Close Bottle

 */ 
