package com.capgemini.collection.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {
		
		
		TreeMap<String, ArrayList<Student>> t1 = new TreeMap<String,ArrayList<Student> >();
		
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student("Arun", 8));
		a1.add(new Student("Bheema", 8));
		a1.add(new Student("Chiyan", 9));
		
		ArrayList<Student> a2 = new ArrayList<Student>();
		a2.add(new Student("Akash", 10));
		a2.add(new Student("Bala", 10));
		a2.add(new Student("Chanakyan",10));
		
		ArrayList<Student> a3  = new ArrayList<Student>();
		a3.add(new Student("Ashika", 12));
		a3.add(new Student("Bhoomika",12));
		a3.add(new Student("Chinnu", 12));
		
		
		t1.put("First std", a1);
		t1.put("Second std", a2);
		t1.put("Third std", a3);
		
		
		Set<Entry<String, ArrayList<Student>>> s1 = t1.entrySet();
		for (Map.Entry<String, ArrayList<Student>> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("************************************************************************************************************");
		}
		
		
	}
}

//First std
//[Student [name=Arun, age=8], Student [name=Bheema, age=8], Student [name=Chiyan, age=9]]
//************************************************************************************************************
//Second std
//[Student [name=Akash, age=10], Student [name=Bala, age=10], Student [name=Chanakyan, age=10]]
//************************************************************************************************************
//Third std
//[Student [name=Ashika, age=12], Student [name=Bhoomika, age=12], Student [name=Chinnu, age=12]]
//************************************************************************************************************
//
