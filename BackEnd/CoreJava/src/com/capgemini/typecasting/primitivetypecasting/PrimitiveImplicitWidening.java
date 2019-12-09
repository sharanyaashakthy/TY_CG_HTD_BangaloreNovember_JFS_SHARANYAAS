package com.capgemini.typecasting.primitivetypecasting;

public class PrimitiveImplicitWidening {
	byte b = 2;
	
	//implicit widening 
	short s = b;
	int i = b;
	long l = b;
	float f = b;
	double d = b;
	
	void values()
	{
		System.out.println("byte b = "+b);
		System.out.println("short s = "+b);
		System.out.println("int i = "+b);
		System.out.println("long l = "+b);
		System.out.println("float f = "+b);
		System.out.println("double d = "+b);
	}
	public static void main(String[] args) 
	{
		PrimitiveImplicitWidening p =new PrimitiveImplicitWidening();
		p.values();
		
	}
	
/*
byte b = 2
short s = 2
int i = 2
long l = 2
float f = 2
double d = 2
*/
	

}
