package edu.jsp.programming.arrays;

import java.util.Scanner;

public class Program2 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int[] arr= new int[sc.nextInt()];
		
		System.out.println("enter the elements for the array");
		System.out.println("--------------------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the element at " +i+ "location");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are ");
		System.out.println("-------------------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr[" +i+ "] = "+arr[i]);
			
		}
		
		int sum = 0;
		for(int i = 0; i<arr.length;i++)
		{
			sum = sum+arr[i];
			
		}
		System.out.println("sum of the array elements are "+sum);
		System.out.println("Average of the sum is "+sum/arr.length);
		

	}
}
