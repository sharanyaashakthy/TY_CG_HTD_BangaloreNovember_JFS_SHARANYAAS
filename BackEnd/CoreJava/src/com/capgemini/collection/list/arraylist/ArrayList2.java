package com.capgemini.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Dinga");
		a1.add("Dingi");
		a1.add("Binga");
		a1.add("Bingi");
		
		System.out.println(a1.isEmpty());//false
		System.out.println(a1.size());//4
		System.out.println(a1.contains("Binga"));//true
		a1.remove(0);
		System.out.println(a1);//[Dingi, Binga, Bingi]
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Pinga");
		a2.add("Tinga");
		a2.add("Ginga");
		
		a1.addAll(a2);
		System.out.println("a1, after adding a2: "+a1);
		
		a1.removeAll(a2);
		System.out.println("a1, after removing a2: "+a1);
		
		a1.containsAll(a2);
		System.out.println("a1 containsAll a2 "+a1);
		System.out.println(a1.containsAll(a2));
		
		a1.retainAll(a2);
		System.out.println("a1 retainAll a2 "+a2);
		
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("Finga");
		a3.add("Ringa");
		a3.add("Kinga");
		a3.add("Linga");
		System.out.println(a3); //[Finga, Ringa, Kinga, Linga]
		a3.toArray();
		System.out.println(a3);//[Finga, Ringa, Kinga, Linga]
		
	 	
		System.out.println("sublist of a3 "+a3.subList(1, 2));  //sublist of a3 [Ringa]
		
		


	}

}
