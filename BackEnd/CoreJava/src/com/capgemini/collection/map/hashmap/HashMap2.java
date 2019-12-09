package com.capgemini.collection.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer, Student> h1 = new HashMap<Integer, Student>();
		h1.put(34, new Student("Binga"));
		h1.put(55, new Student("Jinga"));
		h1.put(98, new Student("Jinga"));
		h1.put(null, null);
		h1.put(34, new Student("Zinga"));
		Collection<Student> c1  = h1.values();
		for (Student s1 : c1) {
			System.out.println(s1);
		}
		
		System.out.println("---------Key values---------");
		Set<Integer> s1 = h1.keySet();
		for (Integer i1 : s1) {
			System.out.println(i1);
		}
		
		Set <Integer>s2 = h1.keySet();
		System.out.println(s2);
		
		System.out.println(h1.containsKey(34));
		
		//override hashcode and equals method for any object comparison 
		System.out.println(h1.containsValue(new Student("Finga")));
		
		int i2 = h1.size();
		System.out.println(i2);//4
		
	    System.out.println(h1.isEmpty());
		
		
	}

}

//null
//Student [name=Zinga]
//Student [name=Jinga]
//Student [name=Jinga]
//---------Key values---------
//null
//34
//98
//55
//[null, 34, 98, 55]
//true
//false
//4
//false
