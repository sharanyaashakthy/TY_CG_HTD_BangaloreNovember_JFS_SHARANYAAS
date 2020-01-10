package com.capgemini.datastructure_and_algorithms;

import java.time.Duration;
import java.time.Instant;

public class MergeSort {
	
		public static void mergeSort(int[] arr)
		{
			if(arr.length == 1)
				return;
			int mid = arr.length/2;
			
			int[] left = new int[mid];
			for(int i=0;i<mid;i++)
				left[i]=arr[i];
			
			int[] right = new int[arr.length-mid];
			for(int i=mid;i<arr.length;i++)
				right[i-mid]=arr[i];
			
			
			mergeSort(left);
			mergeSort(right);
			merge(arr,left,right);
			
		}
		
		public static void merge(int[] arr, int[]left, int[] right)
		{
			int i=0,j=0,k=0;
			while(i<left.length && j<right.length)
			{
				if(left[i]<=right[j])
					arr[k++] = left[i++];
				else
					arr[k++]=right[j++];
			}
			while(i<left.length)
			{
				arr[k++]=left[i++];
			}
			while(j<right.length)
			{
				arr[k++]=right[j++];
			}
			
		}
		
		public static void countingDurationMergeSort(int arr[]) {
			
			Instant start =  Instant.now(); //stores the time of starting the execution
			mergeSort(arr);
			Instant end = Instant.now();//ending time of execution
			
			//toMillis return datatype is long
			long duration = Duration.between(start, end).toMillis();//computes the time b/w start and end
			
			double seconds  = duration/1000.0;
			System.out.println("mergesort time "+ seconds + "seconds");
		}

	}

