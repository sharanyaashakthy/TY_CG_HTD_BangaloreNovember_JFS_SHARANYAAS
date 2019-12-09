package com.capgemini.collection.map.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
//Integer wrapper class implements comparable interface , thus, it sorts in asc order
//sort only based on the key 
public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(56, "Hinga");
		t1.put(88, "Pinga");
		t1.put(199, "Xinga");
		//t1.put(null, "Jinga"); not allowed
		
		
		Set<Entry<Integer, String>> s1 = t1.entrySet();
		for (Entry<Integer, String> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("**************");
			
		}
	}
}

//56
//Hinga
//**************
//88
//Pinga
//**************
//199
//Xinga
//**************
