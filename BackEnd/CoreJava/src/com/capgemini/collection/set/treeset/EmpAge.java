package com.capgemini.collection.set.treeset;

import java.util.Comparator;

public class EmpAge implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.age > o2.age)
			return 1;
		else if(o1.age < o2.age)
			return -1;
		else
			return 0;
	
	
	}
}
