package edu.jsp.programming.arrays;

import java.util.Scanner;

public class Mergearray
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array a");
		int[] a= new int[sc.nextInt()];
		
		System.out.println("enter the elements for array a");
		System.out.println("--------------------------------");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the size of the array b");
		int[] b= new int[sc.nextInt()];
		
		System.out.println("enter the elements for array b");
		System.out.println("--------------------------------");
		
		for(int j=0;j<b.length;j++)
		{
			b[j]=sc.nextInt();
		}
		
		int i=0,j=0,k=0;
		int[] res = new int[a.length + b.length];
		
		while(i<a.length)
		{
			res[k++]=a[i++];
		}
		while(j<b.length)
		{
			res[k++]=b[j++];
		}
		System.out.println("Merged array elements are " );
		for(i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
		
	}

}
