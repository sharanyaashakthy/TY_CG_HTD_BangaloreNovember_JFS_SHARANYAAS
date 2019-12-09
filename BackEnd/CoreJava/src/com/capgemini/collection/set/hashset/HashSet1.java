package com.capgemini.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(23);
		h1.add(23);
		h1.add(45);
		h1.add(67);
		h1.add(99);
		h1.add(null);
		h1.add(null);
		System.out.println(h1);
		System.out.println("-----Iteration using forEach------");
		for (Integer i1 : h1) {
			System.out.println(i1);
		}
		
		HashSet<String> h2 = new HashSet<String>();
		h2.add("Binga");
		h2.add("Cinga");
		h2.add("Dinga");
		h2.add("Einga");
		System.out.println(h2);
		System.out.println("--------Iteration using iterator()-----");
		Iterator<String> itr = h2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.hashCode());
			System.out.println(itr.next());
		}
	}
	
//       	[null, 67, 99, 23, 45]
//			-----Iteration using forEach------
//			null
//			67
//			99
//			23
//			45
//			[Binga, Cinga, Einga, Dinga]
//			--------Iteration using iterator()-----
//			366712642
//			Binga
//			366712642
//			Cinga
//			366712642
//			Einga
//			366712642
//			Dinga

}
