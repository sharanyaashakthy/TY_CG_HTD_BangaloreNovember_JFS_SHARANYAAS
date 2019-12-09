package com.capgemini.accessmodifier;

//inside the same packgae for Worker class with public A.M
public class TestWorker {
	public static void main(String[] args) {
		Worker w = new Worker("Shakthy");
		w.workerDetails();
		Worker.workerAge();
	}

}
//Worker name is Shakthy
//Worker's age is 23

//refer the same TestWorker class in accessmodifierdemo package
