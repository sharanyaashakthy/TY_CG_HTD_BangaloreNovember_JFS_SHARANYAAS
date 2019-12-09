package com.capgemini.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Insertion order is not preserved.
public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(12, "Binga");
		h1.put(78, "Dinga");
		h1.put(94, "Tinga");
		h1.put(500, "Singa");
		Set<Map.Entry<Integer, String>> s1 = h1.entrySet();
		
		for (Map.Entry<Integer, String> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------");
		}
	}
}

//500
//Singa
//-----------
//12
//Binga
//-----------
//78
//Dinga
//-----------
//94
//Tinga
//-----------