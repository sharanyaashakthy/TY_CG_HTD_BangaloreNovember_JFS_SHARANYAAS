package com.capgemini.exceptionhandling.checkedexception.customcheckedexception;

public class Election {
	void vote(int age) throws AgeLimitException
	{
		if(age < 18)
		{
			throw new AgeLimitException("Your age should be above 18");
		}
		else
		{
			System.out.println("Allowed for voting");
			
		}
	}

}
