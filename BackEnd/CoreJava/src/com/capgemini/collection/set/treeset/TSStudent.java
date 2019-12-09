package com.capgemini.collection.set.treeset;

import java.util.TreeSet;

public class TSStudent {
	public static void main(String[] args) {
		TreeSet<Student> t1 = new TreeSet<Student>();
		t1.add(new Student(22, "Jinga"));
		t1.add(new Student(23, "Linga"));
		t1.add(new Student(16, "Ninga"));
		for (Student s1 : t1) {
			System.out.println(s1);
		}
		
	}

}

//16 Ninga
//22 Jinga
//23 Linga
