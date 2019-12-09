package com.capgemini.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(45);
		l1.add(45);
		l1.add(67);
		l1.add(68);
		l1.add(null);
		
		System.out.println("----------Peek, peekFirst, peekLast---------");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
//		----------Peek, peekFirst, peekLast---------
//		45
//		45
//		null
//		[45, 45, 67, 68, null]
		
		System.out.println("---------poll, pollFirst, pollLast----------");
		System.out.println(l1.poll()); //returns the removed object
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
//		---------poll, pollFirst, pollLast----------
//		45
//		45
//		null
//		[67, 68]
		
		System.out.println("-------offer, offerFirst,offerLast----------");
		System.out.println(l1.offer(565));
		System.out.println(l1.offerFirst(897));
		System.out.println(l1.offerLast(996));
		System.out.println(l1);
		
//		-------offer, offerFirst,offerLast----------
//		true
//		true
//		true
//		[897, 67, 68, 565, 996]
	}
}
