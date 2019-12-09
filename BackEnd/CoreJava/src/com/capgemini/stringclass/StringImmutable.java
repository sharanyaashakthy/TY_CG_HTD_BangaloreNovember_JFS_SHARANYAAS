package com.capgemini.stringclass;

public class StringImmutable {
	public static void main(String[] args) {
		String s1 =  new String("John");
		System.out.println(s1.hashCode());
		s1 = new String("Marsh");
		System.out.println(s1.hashCode());
		s1 = s1.concat("Michael");
		System.out.println(s1);
		System.out.println(s1.hashCode());
	}

}
/*
2314539
74114067
MarshMichael
-200052076
 */
