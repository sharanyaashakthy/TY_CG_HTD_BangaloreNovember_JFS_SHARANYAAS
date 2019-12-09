package com.capgemini.collection.list.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1 =  new LinkedList();
		l1.add(23);
		l1.add(34);
		l1.add(45);
		l1.add(34);
		l1.add(23);
		l1.add(null);
		

		
		ListIterator ltr = l1.listIterator();
		System.out.println("while---------");
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
//      while---------
//		23
//		34
//		45
//		34
//		23
//		null
		
		System.out.println("forEach-----------");
		for ( Object  i1 : l1) {
			System.out.println(i1);
		}
		
//		forEach-----------
//		23
//		34
//		45
//		34
//		23
//		null
		
		System.out.println("for-------------");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
			
		}
		
//		for-------------
//		23
//		34
//		45
//		34
//		23
//		null
		
		System.out.println("Before "+l1);// Before [23, 34, 45, 34, 23, null]
		l1.remove(new Integer(23)); // removes the first inserted 23 value by default
		System.out.println("After "+l1); //After [34, 45, 34, 23, null]
		
		
		

	}

}
