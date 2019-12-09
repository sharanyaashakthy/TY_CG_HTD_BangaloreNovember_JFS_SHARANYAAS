package com.capgemini.arrays;

public class DoubleArray {
	public static void main(String[] args) {
		double a1[] = new double[4];
		a1[0] = 10.56;
		a1[1] = 20;
		a1[2] = 30.98;
		
		System.out.println(a1.length);//4
		for(int i = 0; i<a1.length; i++)
		{
			System.out.println(a1[i]);
		}
		
	}

}
//4
//10.56
//20.0
//30.98
//0.0 //default value for double
