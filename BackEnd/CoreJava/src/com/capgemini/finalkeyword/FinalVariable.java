package com.capgemini.finalkeyword;

//when there is any variable declared as final, it must be initialized and must be used in all the constructors.
//Because, it must be a initialized value


public class FinalVariable {
	final double PI;
	//int a;
	FinalVariable(double PI)
	{
		this.PI = PI;
	}
	FinalVariable(int a, double PI)
	{
		
		this.PI = PI;
		System.out.print(a+" ");
	}
	void piValue()
	{
		System.out.println(PI);
		//System.out.print(a+" ");
		
	}
	

}
