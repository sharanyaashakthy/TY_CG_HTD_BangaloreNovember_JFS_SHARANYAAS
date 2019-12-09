package com.capgemini.collection.list.listmethods;

import java.util.ArrayList;
import java.util.List;

//list methods 

public class List2 {
	public static void main(String[] args) {
		List <Double> l2 = new ArrayList<Double>();
		l2.add(0, 867.56);
		l2.add(1, 87.45);
		l2.add(2, 56.45);
		l2.add(3, 54.67);
		l2.add(4, 56.45);
		l2.add(1, 45.565);
		
		System.out.println(l2); 
		
		
		l2.remove(2);
		System.out.println("after removing at position 2 "+l2); 
		
		System.out.println(l2.indexOf(99.99));
		
		List <Double> l3 = new ArrayList<Double>();
		l3.add(0, 1546.454);
		l3.add(1, 55.566);
		l3.add(2, 34.4645);
		l3.add(110.45);
		System.out.println(l3); 
		System.out.println(l3.lastIndexOf(110.45)); 
		System.out.println(l3.get(3));
		
		l2.addAll(l3);
		System.out.println("adding l3 to l2 "+l2); 
		
		l3.set(3, 999.999);
		System.out.println("setting 999 at position 3 "+l3); 
		
		
		//it ignores the element in the last position
		List<Double> l4 = l3.subList(1, 3);
		System.out.println("sublist of l2 "+l3); 
	}
}
//[867.56, 45.565, 87.45, 56.45, 54.67, 56.45]
//after removing at position 2 [867.56, 45.565, 56.45, 54.67, 56.45]
//-1
//[1546.454, 55.566, 34.4645, 110.45]
//3
//110.45
//adding l3 to l2 [867.56, 45.565, 56.45, 54.67, 56.45, 1546.454, 55.566, 34.4645, 110.45]
//setting 999 at position 3 [1546.454, 55.566, 34.4645, 999.999]
//sublist of l2 [1546.454, 55.566, 34.4645, 999.999]
		
		
		

		
