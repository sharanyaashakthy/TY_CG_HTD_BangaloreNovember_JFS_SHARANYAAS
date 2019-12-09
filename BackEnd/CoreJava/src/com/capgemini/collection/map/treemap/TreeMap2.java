package com.capgemini.collection.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
//Student class must be of Comparable type

//TreeMap2, Student , StudAge
public class TreeMap2 {
	public static void main(String[] args) {
		//*******COMPARATOR INTERFACE**********
//		StudAge s11 = new StudAge();
//		TreeMap<Student,String> t1 = new TreeMap<Student, String>(s11);
		
		
		//*********COMPARABLE INTERFACE*************
		TreeMap<Student,String> t1 = new TreeMap<Student, String>();
		t1.put(new Student("Binga", 10), "First Standard");
		t1.put(new Student("Ringa", 12), "Third Standard");
		t1.put(new Student("Dinga", 11), "Second Standard");
		Set<Entry<Student, String>> s1 = t1.entrySet();
		for (Map.Entry<Student, String> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("*************************************");
		}
	}

}
//SORTING BASED ON AGE 
//Student [name=Binga, age=10]
//First Standard
//*************************************
//Student [name=Dinga, age=11]
//Second Standard
//*************************************
//Student [name=Ringa, age=12]
//Third Standard
//*************************************