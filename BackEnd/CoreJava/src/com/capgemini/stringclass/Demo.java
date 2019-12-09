package com.capgemini.stringclass;


public class Demo {
	public static void main(String[] args) {
		
		//StringBuffer  ---------> mutable
		StringBuffer s1 = new StringBuffer("john");
		System.out.println(s1.hashCode());
		s1 = s1.append("michael");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		
		//StringBuilder  ---------> mutable
		StringBuilder s2 = new StringBuilder("Shakthy");
		System.out.println(s2.hashCode());
		s2 = s2.append("Sharan");
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}

}
//366712642
//johnmichael
//366712642
//1829164700
//ShakthySharan
//1829164700
