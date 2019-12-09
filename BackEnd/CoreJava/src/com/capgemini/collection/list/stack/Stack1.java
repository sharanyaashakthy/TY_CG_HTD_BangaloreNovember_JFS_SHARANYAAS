package com.capgemini.collection.list.stack;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.add(23);
		s1.add(56);
		s1.add(67);
		System.out.println(s1); //[23, 56, 67]
		
		System.out.println(s1.pop());//67
		System.out.println(s1); //[23, 56]
		System.out.println(s1.peek());//56 //displays without removing the object
		System.out.println(s1);//[23, 56]
		System.out.println(s1.search(23));//2//its the current offset value
		System.out.println(s1);//[23, 56]
		
		
		
	}

}
