package com.capgemini.datastructure_and_algorithms;

import java.time.Duration;
import java.time.Instant;
//import java.util.Scanner;

public class AlgoAnalysis {
	public static void main(String[] args) {
		//long number = 99999999l;
//		System.out.println(addUpto(number));
//		System.out.println(addUptoQuick(number));
		
		countingDuration2();
		countingDuration1();
	}
	
	public static long addUpto(long number)
	{
		long total = 0l;
		for(long i = 0; i<=number;i++) {
			total = total + i;
		}
		return total;
	}
	
	public static long addUptoQuick(long number)
	{
		return number*(number+1)/2;
	}
	
	//counting duration  of addUpto(long number)
	public static void countingDuration1() {
		long number = 99999999l;
		Instant start =  Instant.now(); //stores the time of starting the execution
		System.out.println("addUpto "+addUpto(number));
		Instant end = Instant.now();//ending time of execution
		
		//toMillis return datatype is long
		long duration = Duration.between(start, end).toMillis();//computes the time b/w start and end
		
		double seconds  = duration/1000.0;
		System.out.println("addUpto time "+ seconds + "seconds");
	}
	
	
	public static void countingDuration2() {
		long number = 99999999l;
		Instant start =  Instant.now(); //stores the time of starting the execution
		System.out.println("addUpto "+addUptoQuick(number));
		Instant end = Instant.now();//ending time of execution
		
		//toMillis return datatype is long
		long duration = Duration.between(start, end).toMillis();//computes the time b/w start and end
		
		double seconds  = duration/1000.0;
		System.out.println("addUptoQuick time "+ seconds + "seconds");
	}

}
