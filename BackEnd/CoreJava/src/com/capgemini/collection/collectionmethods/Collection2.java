package com.capgemini.collection.collectionmethods;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add(12);
		c1.add(13);
		c1.add(14);
		c1.add(28);
		c1.add(30);
		System.out.println("Initial c1 "+c1);
		
		Collection c2 = new ArrayList();
		c2.add(12);
		c2.add(13);
		c2.add(14);
		c2.add(15);
		c2.add(16);
		c2.add(67);
		c2.add(70);
		
		System.out.println("Initial c2 "+c2);
		
		c1.addAll(c2);
		System.out.println("After adding c2 to c1 "+c1);
		
		c1.retainAll(c2);
		System.out.println("After retaining c2 in c1 "+c1);
		
		
		System.out.println("c1 containing c2 obj "+c1.containsAll(c2));
		
		
		Collection c3 = new ArrayList();
		c3.add(23);
		c3.add(25);
		c3.add(25);
		//converting collection into array
		Object[] o1 =  c3.toArray();
		for(int i = 0; i<o1.length; i++)
		{
			System.out.println("c3 to array "+o1[i]);
		}
		
		
		
		
		
	}

}
