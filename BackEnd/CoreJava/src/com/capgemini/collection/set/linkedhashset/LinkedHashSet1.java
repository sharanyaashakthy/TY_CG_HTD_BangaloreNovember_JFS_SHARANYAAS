package com.capgemini.collection.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

//Insertion order is preserved and duplicates are not allowed
public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet l1 =new LinkedHashSet();
		l1.add(12);
		l1.add(24);
		l1.add(44);
		l1.add(34);
		
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
//12
//24
//44
//34
