package com.capgemini.collection.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
//Insertion order preserved and no duplicates allowed
public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
		l1.put("BTM", 560072);
		l1.put("Hebbal", 560073);
		l1.put("RajajiNagar", 560074);
		l1.put("Bangalore", 5600787);
		l1.remove("Bangalore");
		l1.put("Hebbal", 560073);
		//l1.put("Hebbal", 560074); //overrides the previous value
		
		Set<Map.Entry<String, Integer>> s1 = l1.entrySet();
		for (Map.Entry<String, Integer> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}
		
	}

}
//BTM
//560072
//
//Hebbal
//560073
//
//RajajiNagar
//560074
//
