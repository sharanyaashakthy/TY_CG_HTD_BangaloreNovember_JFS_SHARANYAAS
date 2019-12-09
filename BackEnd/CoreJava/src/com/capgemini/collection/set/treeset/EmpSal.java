package com.capgemini.collection.set.treeset;

import java.util.Comparator;

public class EmpSal implements Comparator<Emp> {
	public int compare(Emp o1, Emp o2) {
		if(o1.salary > o2.salary)
			return 1;
		else if(o1.salary < o2.salary)
			return -1;
		else
			return 0;
	}

}
