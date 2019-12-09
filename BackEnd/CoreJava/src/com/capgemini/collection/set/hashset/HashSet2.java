package com.capgemini.collection.set.hashset;

import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
	HashSet<Student> h1 = new HashSet<Student>();
	h1.add(new Student(11,"Dinga"));
	h1.add(new Student(22,"Binga"));
	h1.add(new Student(33,"Cinga"));
	h1.add(new Student(33,"Cinga"));
	h1.add(new Student(44,"Einga"));
	System.out.println(h1);
	for (Student s1 : h1) {
		System.out.println(s1.name +" "+s1.age);
	}
	   
	}
}
