package com.capgemini.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList5 {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		//COLLECTION METHODS
		System.out.println();
		System.out.println("********************COLLECTION METHODS********************");
		l1.add("Ainga");
		l1.add("Binga");
		l1.add("Cinga");
		l1.add("Dinga");
		l1.add("Einga");
		System.out.println(l1);
		l1.remove("Ainga");
		System.out.println(l1);
		System.out.println(l1.contains("Ainga"));
		l1.add("Ainga");
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		Object[] o1 = l1.toArray();
		for(int i=0; i<o1.length; i++)
		{
			System.out.println(o1[i]);
		}
		System.out.println("-----------Iterator-----------");
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Finga");
		l2.add("Ginga");
		l2.add("Hinga");
		l2.add("Iinga");
		l2.add("Jinga");
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l1.containsAll(l2));
		l1.retainAll(l2);
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
		
		//LIST METHODS
		System.out.println("********************LIST METHODS********************");
		LinkedList<String> l3 = new LinkedList<String>();
		l3.add(0, "Kinga");
		l3.add(1,"Linga");
		l3.add(2, "Minga");
		System.out.println(l3);
		System.out.println(l3.indexOf("Minga"));
		System.out.println(l3.lastIndexOf("Minga"));
		l3.set(2, "Miinga");
		System.out.println(l3.get(2));
		l3.remove(2);
		System.out.println(l3);
		l3.add("Minga");
		System.out.println(l3);
		
		LinkedList<String> l4 = new LinkedList<String>();
		l4.add("Ninga");
		l4.add("Oinga");
		l4.add("Pinga");
		System.out.println(l4);
		l3.addAll(l4);
		System.out.println(l3);
		System.out.println(l3.subList(2, 5));
		System.out.println("-----------List Iterator-----------");
		ListIterator<String> ltr = l3.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		
		//LINKED LIST METHODS
		System.out.println("********************LINKED LIST METHODS********************");
		LinkedList<String> l5 = new LinkedList<String>();
		l5.addFirst("Quinga");
		l5.addFirst("Ringa");
		l5.addFirst("Singa");
		l5.addLast("Tinga");
		System.out.println(l5);
		System.out.println(l5.getFirst());
		System.out.println(l5.getLast());
		System.out.println(l5.peek());
		System.out.println(l5.peekFirst());
		System.out.println(l5.peekLast());
		System.out.println(l5.poll());
		System.out.println(l5.pollFirst());
		System.out.println(l5.pollLast());
		System.out.println(l5);
		
		LinkedList<String> l6 = new LinkedList<String>();
		l6.offer("Uinga");
		l6.offerFirst("Vinga");
		l6.offerFirst("Winga");
		l6.offerLast("Xinga");
		l6.offerLast("Yinga");
		l6.offerLast("Zinga");
		System.out.println(l6);
		l6.push(null);
		System.out.println(l6);
		l6.pop();
		System.out.println(l6);
		System.out.println(l6.element());
		System.out.println(l6);
	
		
	}

}
