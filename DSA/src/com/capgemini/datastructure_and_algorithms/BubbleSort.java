package com.capgemini.datastructure_and_algorithms;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort {
	public static int[] bubbleSort(int arr[])
	{

		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap temp and arr[i]
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
				}
		return arr;
	}
	
	 public static int[] countingDurationBubbleSort() {
		
		//stores the time of starting the execution
		Instant start =  Instant.now();
		int arr[] = bubbleSort(arr);
		Instant end = Instant.now();//ending time of execution
		
		//toMillis return datatype is long
		long duration = Duration.between(start, end).toMillis();//computes the time b/w start and end
		
		double seconds  = duration/1000.0;
		System.out.println("bubblesort time "+ seconds + "seconds");
		return arr;
	}
}
