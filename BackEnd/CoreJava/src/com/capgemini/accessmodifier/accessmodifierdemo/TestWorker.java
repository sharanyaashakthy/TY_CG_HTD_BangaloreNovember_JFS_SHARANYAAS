package com.capgemini.accessmodifier.accessmodifierdemo;

import static com.capgemini.accessmodifier.Worker.*;

import com.capgemini.accessmodifier.Worker;

public class TestWorker {
	public static void main(String[] args) {
		Worker w1 = new Worker("John");
		w1.workerDetails();
		
		System.out.println(age);
		workerAge();
		
	}

}
/*
 Worker name is John
23
Worker's age is 23
*/
