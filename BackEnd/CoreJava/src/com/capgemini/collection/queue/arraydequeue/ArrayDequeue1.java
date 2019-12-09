package com.capgemini.collection.queue.arraydequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeue1 {
	public static void main(String[] args) {
		ArrayDeque<String> a1 = new ArrayDeque<String>();
		a1.add("Binga");
		a1.addFirst("Ainga");
		a1.add("Cinga");
		a1.add("Dinga");
		
		Iterator<String> itr  = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
