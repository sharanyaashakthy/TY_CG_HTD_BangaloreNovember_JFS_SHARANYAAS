package com.capgemini.objectclass;

public class EqualsMethod 
{
	public static void main(String[] args) {
		
		String s1 = new String ("Shakthy");
		String s2 = new String ("Shakthy");
		
		
		//compares based on the hashcode
		System.out.println(s1==s2);
		//compares based on the values of the object
		System.out.println(s1.equals(s2));
	}

}

//false
//true
