package com.capgemini.accessmodifier;

public class TestPerson {
	public static void main(String[] args) {
		//Person p = new Person(); cna't create object for this since there is a private constructor
		
		//after changing the private constructor and private method to default type,
		
		Person p = new Person("Shakthy");
		p.details();
		
		
		
	}

}
//Name Shakthy