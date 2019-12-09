package com.capgemini.typecasting.primitivetypecasting;

public class PrimitiveExplicitNarrowing {
	
	double d = 3.14;
	
	float f = (float)d;
	long l = (long)d;
	int i = (int) d;
	short s = (short)d;
	byte b = (byte) d;
	
	void values()
	{
		System.out.println("float f = "+f);
		System.out.println("long l = "+l);
		System.out.println("int i = "+i);
		System.out.println("short s = "+s);
		System.out.println("byte b = "+b);
	}
	public static void main(String[] args) {
		PrimitiveExplicitNarrowing p1 = new PrimitiveExplicitNarrowing();
		p1.values();
		
	}
}
/*
float f = 3.14
long l = 3
int i = 3
short s = 3
byte b = 3
*/
