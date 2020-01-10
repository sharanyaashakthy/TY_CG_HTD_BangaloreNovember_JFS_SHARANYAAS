package edu.jsp.programming.arrays;
//biggest duplicate value
import java.util.Scanner;

public class Program12 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int[] arr= new int[sc.nextInt()];
		
		System.out.println("enter the elements for the array");
		System.out.println("--------------------------------");
		int large=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
			if(count !=0 && arr[i]>large)
			{
				large=arr[i];
			}
			
			
		}
		System.out.println("largest duplicate element "+large);
	}

}
