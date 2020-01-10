package com.capgemini.datastructure_and_algorithms;

import java.util.Scanner;

public class TestSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******SORTING ARRAYS*******");
		System.out.println("enter the size of the array");
		int[] arr= new int[sc.nextInt()];
		
		System.out.println("enter the elements for the array");
		System.out.println("********************************");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are ");
		System.out.println("*******************");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr[" +i+ "] = "+arr[i]);
			
		}
	  
		System.out.println();
		
		
		while(true)
		{
			System.out.println("choose an algorithm to sort your array elements");
			System.out.println("1.Bubble sort\n2.Merge sort\n3.Insertion sort\n4.Quick sort\n5.Exit");
			System.out.println("***********************************************");
			
			int n = sc.nextInt();
			switch (n) {
			case 1:BubbleSort.bubbleSort(arr);
			       int[] arr1 = BubbleSort.countingDurationBubbleSort();
				   System.out.println("After Bubble sorting");
				   break;
				   
				   
			case 2:MergeSort.mergeSort(arr1);
			       MergeSort.countingDurationMergeSort(arr1);
			       System.out.println("After Merge sorting");
				   break;
				   
				   
			case 3:InsertionSort.insertionSort(arr1, n);
			       InsertionSort.countingDurationInsertionSort(arr1, n);
			       System.out.println("After Insertion sorting");
				   break;
				   
				   
			case 4:QuickSort.quickSort(arr1, n, n);
			       QuickSort.countingDurationQuickSort(arr1, n, n);
			       System.out.println("After Quick sorting");
				   break;
				   
				   
			case 5: System.exit(0);
					System.out.println("Exited");
					
					
			default:System.out.println("Invalid choice");
				    break;
			}
			
			 for(int i=0;i<arr.length;i++)
			 {
			    System.out.print(arr[i]+" ");
			 }
			 System.out.println();
			   
		}
		
	}

}
