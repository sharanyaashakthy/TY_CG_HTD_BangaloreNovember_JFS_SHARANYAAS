package com.capgemini.wrapperclasses;

public class BoxingAndUnboxing {
	public static void main(String[] args) {
		int  i1 = 10;
		//boxing
		Integer i2 = new Integer(i1);
		//unboxing
		int i3 = i2.intValue();
		
		double d1 = 23.45;
		Double d2 = new Double(d1);
		double d3 = d2.doubleValue();
		
		char c1 = 's';
		Character c2 = new Character(c1);
		char c3 = c2.charValue();
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}

//10
//10
//10
//23.45
//23.45
//23.45
//s
//s
//s
//
