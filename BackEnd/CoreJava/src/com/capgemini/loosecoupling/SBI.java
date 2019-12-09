package com.capgemini.loosecoupling;

public class SBI extends Bank {
	
	@Override
	void withdraw()
	{
		System.out.println("Withdraw done from SBI");
	}

}
