package com.capgemini.exceptionhandling.uncheckedexception.customunchecked;

public class Bank {
	void withdraw(double amount)
	{
		if(amount > 40000)
		{
			throw new DayLimitException("User exceeds day limit exception");
		}
	}

}
