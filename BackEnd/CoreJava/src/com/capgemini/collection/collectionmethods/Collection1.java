package com.capgemini.collection.collectionmethods;

import java.util.*;

public class Collection1 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		//heterogeneous nature and is also growable
		c1.add(12);
		c1.add(13);
		c1.add(14);
		c1.add("Hi");
		c1.add('a');
		
		System.out.println(c1);
		System.out.println(c1.size());
		System.out.println(c1.contains(12));
		System.out.println(c1.remove(13));
		System.out.println(c1.isEmpty());
		System.out.println(c1.hashCode());
		
		
	}

}
//[12, 13, 14, Hi, a]
//3
//true
//true
//false
//1347
