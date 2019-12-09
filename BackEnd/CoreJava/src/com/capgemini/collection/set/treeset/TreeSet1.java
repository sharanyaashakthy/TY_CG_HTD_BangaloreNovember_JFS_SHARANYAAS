package com.capgemini.collection.set.treeset;

import java.util.TreeSet;


public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(34);
		t1.add(56);
		t1.add(67);
		t1.add(67);
		for (Object o1 : t1) {
			System.out.println(o1);
		}
		
//It is in sorted order.(By default, ascending order, as the Integer wrapper class
		//internally implements comparable interface)
//		34
//		56
//		67
		
		t1.remove(67);
		System.out.println(t1);//[34, 56]
		t1.add(100);
		t1.add(99);
		System.out.println(t1); //[34, 56, 99, 100] //sorted order again


	}

}
