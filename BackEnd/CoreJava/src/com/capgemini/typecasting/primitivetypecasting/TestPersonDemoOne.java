package com.capgemini.typecasting.primitivetypecasting;

import com.capgemini.objectclass.Person;

public class TestPersonDemoOne extends Person {

		public TestPersonDemoOne() {
				super("John");
	}

		public static void main(String[] args) throws Throwable
		{
			
			TestPersonDemoOne t = new  TestPersonDemoOne();
			t.finalize();
			
		}
		
	}
