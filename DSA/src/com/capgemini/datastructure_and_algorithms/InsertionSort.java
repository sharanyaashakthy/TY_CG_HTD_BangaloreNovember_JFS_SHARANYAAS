package com.capgemini.datastructure_and_algorithms;

import java.time.Duration;
import java.time.Instant;

public class InsertionSort {
	public static void insertionSort(int arr[], int n)  
	{  
	    int i, key, j;  
	    for (i = 1; i < n; i++) 
	    {  
	        key = arr[i];  
	        j = i - 1;  
	  
	        /* Move elements of arr[0..i-1], that are  
	        greater than key, to one position ahead  
	        of their current position */
	        while (j >= 0 && arr[j] > key) 
	        {  
	            arr[j + 1] = arr[j];  
	            j = j - 1;  
	        }  
	        arr[j + 1] = key;  
	    }  
	} 
public static void countingDurationInsertionSort(int arr[],int n) {
		
		Instant start =  Instant.now(); //stores the time of starting the execution
		insertionSort(arr, n);
		Instant end = Instant.now();//ending time of execution
		
		//toMillis return datatype is long
		long duration = Duration.between(start, end).toMillis();//computes the time b/w start and end
		
		double seconds  = duration/1000.0;
		System.out.println("insertionsort time "+ seconds + "seconds");
	}

}
