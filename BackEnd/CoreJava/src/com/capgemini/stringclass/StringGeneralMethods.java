package com.capgemini.stringclass;

public class StringGeneralMethods {
	public static void main(String[] args) {
		
		String s1 = "John";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		
		String s2 = "    John Michael    ";
		System.out.println(s2.trim());
		
		String s3 = "Sudhanshu";
		System.out.println(s3.substring(3, 6));
		System.out.println(s3.isEmpty());
		System.out.println(s3.charAt(1));
		System.out.println(s3.indexOf('u'));
		System.out.println(s3.indexOf("Sudha"));
		
		String s4 = "ShreeShree";
		System.out.println(s4.indexOf("re", 4));
		System.out.println(s4.indexOf('h', 4));
		
  }

}
/*
john
JOHN
4
n
John Michael
han
false
u
1
0
7
6


 */ 
