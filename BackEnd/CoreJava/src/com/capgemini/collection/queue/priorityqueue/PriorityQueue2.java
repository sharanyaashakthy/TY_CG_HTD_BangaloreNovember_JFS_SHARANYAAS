package com.capgemini.collection.queue.priorityqueue;

import java.util.PriorityQueue;

//ALLOWS DUPLICATES AND IT DOES NOT SORT ANY ELEMENTS 
//OBJECT MUST BE OF COMPARABLE TYPE
public class PriorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue<Student> p1 = new PriorityQueue<Student>();
		p1.offer(new Student(22, "Ginga"));
		p1.offer(new Student(23, "Minga"));
		p1.offer(new Student(22, "Ginga"));
		for (Object student : p1) {
			System.out.println(student);
		}
	}

}

//Student [age=22, name=Ginga]
//Student [age=23, name=Minga]
//Student [age=22, name=Ginga]

