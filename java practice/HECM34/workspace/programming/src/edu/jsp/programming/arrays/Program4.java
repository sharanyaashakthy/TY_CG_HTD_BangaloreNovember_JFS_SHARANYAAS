package edu.jsp.programming.arrays;
//to find the count of the element which are less than the given element
import java.util.Scanner;

public class Program4
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
		
		System.out.println("enter the element");
		int element = sc.nextInt();
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<element)
				
				count++;
				
			}
			System.out.println(count);

		}
				
	}



