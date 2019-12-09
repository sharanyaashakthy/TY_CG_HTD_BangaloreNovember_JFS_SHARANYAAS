package com.capgemini.loosecoupling;

public class TestBank {
	public static void main(String[] args) {
		BankAtm b1 = new BankAtm();
		SBI s = new SBI();
		HDFC h = new HDFC();
		
		b1.insertCard(s);
	}

}
//Withdraw done from SBI

