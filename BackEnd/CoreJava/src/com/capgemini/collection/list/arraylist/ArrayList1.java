package com.capgemini.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		
		
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		a1.add(39);
		a1.add(49);
		a1.add(59);
		a1.add(69);
		
		//iterating the arraylist using for loop
		System.out.println("iterating the arraylist using for loop");
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
//		iterating the arraylist using for loop
//		39
//		49
//		59
//		69
		
		
		
		
		//iterating the arraylist using forEach loop
		System.out.println("iterating the arraylist using forEach loop");
		for (Integer i1 : a1)
		{
			System.out.println(i1);
			
		}
//		iterating the arraylist using forEach loop
//		39
//		49
//		59
//		69
		
		
		
		//iterating using iterator method present in the iterable interface
		System.out.println("iterating using iterator method present in the iterable interface");
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//		iterating using iterator method present in the iterable interface
//		39
//		49
//		59
//		69
		
		
		
		//iterating using list iterator method present in the iterable interface
		System.out.println("iterating using list iterator method present in the iterable interface");
		ListIterator<Integer> itr1 = a1.listIterator(a1.size());
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
//		iterating using list iterator method present in the iterable interface
//		69
//		59
//		49
//		39
		
		

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(23);
		a2.add(24);
		System.out.println("before "+a2);//before [23, 24]
		//removing elements using object
		a2.remove(new Integer(23));
		System.out.println("after "+a2);//after [24]
		
		
		
	}

}
