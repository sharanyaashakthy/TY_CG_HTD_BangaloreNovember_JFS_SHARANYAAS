package com.capgemini.accessmodifier.accessmodifierdemo;

import com.capgemini.accessmodifier.Student;

//import and is-A relationship is mandatory for accessing the protected members across the package
public class TestStudent extends Student 
	{
		protected TestStudent(String name) 
		{
			super(name);
		}

		public static void main(String[] args) 
		{
			TestStudent s1 = new TestStudent("John");
			s1.studDetails();
		}

}
//Student name is John
