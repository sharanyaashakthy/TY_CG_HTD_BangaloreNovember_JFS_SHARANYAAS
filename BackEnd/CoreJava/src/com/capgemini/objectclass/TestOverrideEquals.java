package com.capgemini.objectclass;

public class TestOverrideEquals {
	public static void main(String[] args) {
		
		OverrideEquals o = new OverrideEquals(01, "Shakthy");
		OverrideEquals o1 = new OverrideEquals(01, "Shakthy");
		
		System.out.println(o.equals(o1));
		System.out.println(o.hashCode());
		System.out.println(o1.hashCode());
		
	}

}

/*
 true
-576289114
-576289114
 */
