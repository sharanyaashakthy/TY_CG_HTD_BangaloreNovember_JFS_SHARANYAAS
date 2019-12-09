package com.capgemini.collection.list.listmethods;

import java.util.ArrayList;
import java.util.List;

//list methods 

public class List1 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(0, 89);
		l1.add(1, 87);
		l1.add(2, 56);
		l1.add(3, 54);
		l1.add(4, 56);
		l1.add(1, 78);//it adds it additionally without removing 87
		
		System.out.println(l1); //[89, 78, 87, 56, 54, 56]
		
		
		l1.remove(1);
		System.out.println("after removing at position 1 "+l1); //after removing at position 1 [89, 87, 56, 54, 56]
		
		System.out.println(l1.indexOf(100));//-1 bcoz, that element is not present in the list
		
		List l2 = new ArrayList();
		l2.add(0, 110);
		l2.add(1, 556);
		l2.add(2, 34);
		l2.add(110);
		System.out.println(l2); //[110, 556, 34, 110]
		System.out.println(l2.lastIndexOf(110)); //3
		System.out.println(l2.get(3));//110
		
		l1.addAll(l2);
		System.out.println("adding l2 to l1 "+l1); //adding l2 to l1 [89, 87, 56, 54, 56, 110, 556, 34, 110]
		
		l2.set(3, 999);
		System.out.println("setting 999 at position 3 "+l2); //setting 999 at position 3 [110, 556, 34, 999]
		
		
		//it ignores the element in the last position
		List l3 = l2.subList(1, 2);
		System.out.println("sublist of l2 "+l3); //sublist of l2 [556]

		
		

	}

}
