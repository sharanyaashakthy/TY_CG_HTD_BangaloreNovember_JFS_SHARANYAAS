package com.capgemini.loosecoupling;

public class TestCrush {
	public static void main(String[] args) {
		PhoneToCrush p = new PhoneToCrush();
		
		Phone p1 = new Phone();
		BasicSet b = new BasicSet();
		Oppo o = new Oppo();
		OnePlus o1 = new OnePlus();
		Apple a =  new Apple();
		
		p.receive(p1);
	}
}


/*
 Thanks
 */
