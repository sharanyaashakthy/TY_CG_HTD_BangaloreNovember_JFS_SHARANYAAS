package com.capgemini.arrays;

public class CharArray {
	public static void main(String[] args) {
		char a1[] = new char[5];
		a1[0] = 'a';//a
		a1[1] = 'b';//b
		a1[2] ='c';//c
		a1[3] = 10;//space --> default value
		a1[4] = 900;//? -----> converts to respective char
		
		
		System.out.println(a1.length);//5
		for(int i = 0; i<a1.length; i++)
		{
			System.out.println(a1[i]);
		}
		
	}

}
//5
//a
//b
//c
//
//
//?
