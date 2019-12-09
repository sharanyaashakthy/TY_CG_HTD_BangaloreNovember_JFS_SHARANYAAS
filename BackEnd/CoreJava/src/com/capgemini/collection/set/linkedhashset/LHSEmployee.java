package com.capgemini.collection.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LHSEmployee {
	public static void main(String[] args) {
		LinkedHashSet<Employee> l1 = new LinkedHashSet<Employee>();
		l1.add(new Employee (22, "John"));
		l1.add(new Employee(44, "Marsh"));
		l1.add(new Employee(44, "Marsh"));
		Iterator<Employee> itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

//Employee [empAge=22, empName=John]
//Employee [empAge=44, empName=Marsh]

