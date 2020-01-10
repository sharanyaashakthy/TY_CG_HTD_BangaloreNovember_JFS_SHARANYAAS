package edu.jsp.programming.arrays;

import java.util.Scanner;

public class Pushingzeroes
{
	    public static void main (String[] args) 
	    { 
	    	Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the size of the array a");
			int[] arr= new int[sc.nextInt()];
			
			System.out.println("enter the elements for array a");
			System.out.println("--------------------------------");
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			} 
			
	        int n = arr.length; 
	        pushZerosToEnd(arr, n); 
	        System.out.println("Array after pushing zeros to the back: "); 
	        for (int i=0; i<n; i++) 
	            System.out.print(arr[i]+" "); 
	    }
	    static void pushZerosToEnd(int arr[], int n) 
	    { 
	        int count = 0;  
	        for (int i = 0; i < n; i++) 
	            if (arr[i] != 0) 
	                arr[count++] = arr[i]; 
	        while (count < n) 
	            arr[count++] = 0; 
	    } 
	  
} 


