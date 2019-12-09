package com.capgemini.abstractkeyword;

public abstract  class Demo {
	int a;
	static int b;
	 abstract void add(int a, int b);
	 void res()
	 {
		 System.out.println("result = "+(a+b));
	 }
	 static
	 {
		 System.out.println("SIB");
		 b = 100;
		 System.out.println(b);
	 }
	 Demo(int a)
	 {
		 this.a = a;
		 System.out.println(a);
	 }
	 {
		 System.out.println("IIB");
	 }
}
