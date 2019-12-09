package com.capgemini.accessmodifier;


//protected members accessed inside the same package
public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student("Shakthy");
		s.studDetails();
		
	}

}
//Student name is Shakthy

//refer the TestStudent in the other package named accessmodifierdemo
