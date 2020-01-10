/*
enter the size of the array
5
enter the elements for the array
--------------------------------
9
8
7
6
5
Largest value in the array is 9
*/


package edu.jsp.programming.arrays;

import java.util.Scanner;

public class Program5
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
			arr[i]=sc.nextInt();
		}
		
		int large = arr[0];
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large = arr[i];
				
			}
		}
			System.out.println("Largest value in the array is "+large);
			
		
	}

}
