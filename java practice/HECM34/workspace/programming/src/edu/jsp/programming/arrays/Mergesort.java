package edu.jsp.programming.arrays;

import java.util.Scanner;

public class Mergesort
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array ");
		int[] arr= new int[sc.nextInt()];
		
		System.out.println("enter the elements for array ");
		System.out.println("-----------------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		mergesort(arr);


       System.out.println("After sorting");
       System.out.println("-------------");
       for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
       System.out.println();
       
       sc.close();
       
	}
	
	public static void mergesort(int[] arr)
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
		
		
		mergesort(left);
		mergesort(right);
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
		
}


