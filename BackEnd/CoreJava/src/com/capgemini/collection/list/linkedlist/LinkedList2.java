package com.capgemini.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(23);
		l1.add(65);
		System.out.println("before "+l1); //before [23, 65]
		l1.addFirst(34);
		l1.addLast(67);
		System.out.println("After "+l1); //After [34, 23, 65, 67]
		System.out.println("--------remove()---------");
		l1.remove(); // removes the first element
		System.out.println(l1);//--------remove()---------
								//[23, 65, 67]
		
	    l1.removeFirst();
		System.out.println("removeFirst() "+l1); //removeFirst() [65, 67]
		
		l1.removeLast();
		System.out.println("removeLast() "+l1); //removeLast() [65]
		
		
		LinkedList l2 = new LinkedList();
		l2.add(45);
		l2.add(34);
		l2.add(67);
		l2.add(37);
		l2.add(45);
		l2.add(56);
		
		l2.removeFirstOccurrence(45); //l2.removeFirstOccurrence(45) [34, 67, 37, 45, 56]
		System.out.println("l2.removeFirstOccurrence(45) "+l2);
		
		l2.removeLastOccurrence(45);
		System.out.println("l2.removeLastOccurrence(45) "+l2); //l2.removeLastOccurrence(45) [34, 67, 37, 56]
		
		System.out.println("l2.getFirst() "+l2.getFirst()); //l2.getFirst() 34
		
		
		System.out.println("l2.getLast() "+l2.getLast()); //l2.getLast() 56
		
		
	}

}
