package com.capgemini.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.add(12);
		l1.add(24);
		l1.add(67);
		
		l1.push(89);
		System.out.println(l1); //[89, 12, 24, 67]
		
		l1.pop();
		System.out.println(l1); //[12, 24, 67]
		
		
		//returns the first element like the get()
		System.out.println("l1.element() " +l1.element()); //l1.element() 12
		System.out.println(l1); //[12, 24, 67]

		
	}

}
