package com.capgemini.finalkeyword;

public class TestIIB {
	public static void main(String[] args) {
		IIB i = new IIB(3000);
		//System.out.println(IIB.Pi); accessing static final dm
		//System.out.println(i.max); accessing non-static final dm
		
		
	}
}

/*
 executing the static initializer block
initializing the static dm only inside the static block, pi = 4000
executing the instance initializer block
30
using the static dm inside non static block , pi = 4000
executing the constructor
3000
*/
