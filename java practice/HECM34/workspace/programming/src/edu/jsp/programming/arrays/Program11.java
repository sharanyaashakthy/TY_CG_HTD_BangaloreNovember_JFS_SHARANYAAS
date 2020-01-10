package edu.jsp.programming.arrays;
//to print the pair that equals the sum of element
import java.util.Scanner;

public class Program11
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
		System.out.println("enter the element to find the pair");
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				int sum=0;
				sum=arr[i]+arr[j];
				if(sum == num)
				{
					System.out.println("the pair is "+((arr[i])+" "+(arr[j])));
					
				}
				/*else
				{
					System.out.println("no pairs");
					break;
				}*/
			}
				
		}
	}
		

}
