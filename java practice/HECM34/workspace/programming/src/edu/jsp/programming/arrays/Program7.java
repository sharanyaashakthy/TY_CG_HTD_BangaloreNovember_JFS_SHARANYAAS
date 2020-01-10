package edu.jsp.programming.arrays;

import java.util.Scanner;

public class Program7 

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
		
		int large = 1;
		for(int i = 0; i<arr.length;i++)
		{
			if(large<arr[i])
			{
				int seclarge = large;
				large=arr[i];
				System.out.println("seclarge "+seclarge);
			}
				
			
			else
			{
				System.out.println("");
			}
		}
	}

}
