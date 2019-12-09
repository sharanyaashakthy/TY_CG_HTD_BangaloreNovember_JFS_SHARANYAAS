package com.capgemini.collection.list.vector;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(34);
		v1.add(56);
		v1.add(67);
		v1.add(89);
		System.out.println(v1); //[34, 56, 67, 89]
		
		v1.set(0, 99);
		System.out.println(v1);//[99, 56, 67, 89]
		
		v1.remove(3);
		System.out.println(v1); //[99, 56, 67]
		
		v1.remove(new Integer(99));
		System.out.println(v1); //[56, 67]

	}

}
