package com.capgemini.collection.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Employee> l1 = new LinkedHashMap<Integer, Employee>();
		l1.put(23, new Employee("Linga", 56678600));
		l1.put(45, new Employee("Zinga", 7800000));
		l1.put(87, new Employee("Vinga", 8880800));
		
		//returns the value for the given key
		System.out.println(l1.get(87));//Employee [name=Vinga, salary=8880800]
		System.out.println();
		
		Set<Map.Entry<Integer, Employee>> s1 = l1.entrySet();
		for (Entry<Integer, Employee> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("**********************************************");
		}
		
		
	}
}

//23
//Employee [name=Linga, salary=56678600]
//**********************************************
//45
//Employee [name=Zinga, salary=7800000]
//**********************************************
//87
//Employee [name=Vinga, salary=8880800]
//**********************************************

