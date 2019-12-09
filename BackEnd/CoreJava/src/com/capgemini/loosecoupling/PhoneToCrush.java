package com.capgemini.loosecoupling;

//checking the properties using instanceof keyword
public class PhoneToCrush {
	void receive(Phone p)
	{
		if(p instanceof Phone)
		{
			System.out.println("Thanks");
		}
		else if(p instanceof BasicSet)
		{
			System.out.println("Thank you");
		}
		else if(p instanceof Oppo)
		{
			System.out.println("Thank you lot");
		}
		else if(p instanceof OnePlus)
		{
			System.out.println("Thank you so much");
		}
		else if(p instanceof Apple)
		{
			System.out.println("Love you");
		}
		else
		{
				System.out.println("Idiot");
		}
	}

}
