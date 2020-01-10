package edu.jsp.programming.arrays;
//to check if the element is present in the given array or not
import java.util.Scanner;

public class Program3 
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
		
		System.out.println("enter the element to be searched");
		int element = sc.nextInt();
		
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == element)
			{
				count++;
				System.out.println("element " +arr[i]+ "is present");
				break;
			}
		}
			if(count == 0)
			{
				System.out.println("element " +element+ " is not present");
			}
				
	}
}
		


