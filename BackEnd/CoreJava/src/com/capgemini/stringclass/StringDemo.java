package com.capgemini.stringclass;

public class StringDemo {
	public static void main(String[] args) {
		
		
		//checking the literal way of creating string objects in String constant pool area
		String s1 = "John";
		System.out.println(s1.hashCode());//same
		
		String s2 = "Michael";
		System.out.println(s2.hashCode());//different
		
		s2 = "Pinky";
		System.out.println(s2.hashCode());//different due to new object value
		
		String s3 = "John";
		System.out.println(s3.hashCode());//same due to same object again
		
		
		//checking the literal way of creating string objects in heap area
		String s4 = new String("John");
		s4 = new String("Divya");
		System.out.println("--"+s4.hashCode());
		String s5 = new String("John");
		
		String s6 = new String("Anu");
		
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
		
		
		
	}

}
/*
2314539
-1575976441
77118883
2314539

--66044729
2314539
2314539
65992
 */ 
