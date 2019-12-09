package com.capgemini.finalkeyword;

public class IIB {
	final int max;
	static final int Pi;
	
	IIB(int max)
	{
		this.max = max;
		System.out.println("executing the constructor");
		System.out.println(max);
		
	}
	{
		int a =30;
		System.out.println("executing the instance initializer block");
		System.out.println(a);
		System.out.println("using the static dm inside non static block , pi = "+Pi);
	}
	static
	{
		System.out.println("executing the static initializer block");
		Pi = 4000;
		System.out.println("initializing the static dm only inside the static block, pi = "+Pi);
	}

}
