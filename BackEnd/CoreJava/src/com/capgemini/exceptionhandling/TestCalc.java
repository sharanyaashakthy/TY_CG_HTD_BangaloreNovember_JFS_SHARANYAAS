package com.capgemini.exceptionhandling;

public class TestCalc {
	public static void main(Demo[] args) {
		System.out.println("main() started");
		Calc c = new Calc();
		c.divide(10, 0);
		System.out.println("main() ended");
		
	}

}

//Before handling
//main() started
//divide() called
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at edu.capgemini.exceptionhandling.Calc.divide(Calc.java:7)
//	at edu.capgemini.exceptionhandling.TestCalc.main(TestCalc.java:7)


//After handling
//main() started
//divide() called
/// by zero
//main() ended
