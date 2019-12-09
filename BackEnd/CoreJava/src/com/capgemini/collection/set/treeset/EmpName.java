package com.capgemini.collection.set.treeset;

import java.util.Comparator;

public class EmpName implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.compareTo(o2);
	}
	

}
