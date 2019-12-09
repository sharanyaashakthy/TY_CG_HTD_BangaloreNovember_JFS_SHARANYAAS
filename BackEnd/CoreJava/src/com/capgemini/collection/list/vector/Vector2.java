package com.capgemini.collection.list.vector;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		System.out.println(v1.size()); //0
		System.out.println(v1.capacity()); //10
		v1.add(23);
		v1.add(56);
		v1.add(78);
		v1.add(100);
		
		System.out.println(v1.size()); //4
		System.out.println(v1.capacity());//10
		System.out.println(v1);//[23, 56, 78, 100]
		
		v1.trimToSize();
		System.out.println(v1.size());//4
		System.out.println(v1.capacity());//4
		
		v1.setSize(10);
		System.out.println(v1.size());//10
		System.out.println(v1);//[23, 56, 78, 100, null, null, null, null, null, null]
		v1.add(200);
		System.out.println(v1.size());//11
		System.out.println(v1); //[23, 56, 78, 100, null, null, null, null, null, null, 200]
		v1.set(5, 600);
		System.out.println(v1);//[23, 56, 78, 100, null, 600, null, null, null, null, 200]
		
		
		
	}

}
