package com.capgemini.collection.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		Queue q1 = new PriorityQueue();
		q1.offer(76);
		q1.offer(89);
		q1.offer(12);
		q1.offer(45);
		q1.offer(2);
		System.out.println(q1);//[2, 12, 76, 89, 45]
		q1.poll();
		System.out.println(q1);//[12, 45, 76, 89]
		q1.poll();
		System.out.println(q1);//[45, 89, 76]
		q1.remove();
		System.out.println(q1);//[76, 89]
		q1.offer(76);
		System.out.println(q1);//[76, 89, 76]
		System.out.println(q1.peek());//76
		System.out.println(q1.element());//76
		//.offer(null);//null pointer exception
		
		
		
	}

}
