package edu.jsp.programming.arrays;

import java.util.Scanner;

public class Program6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num= sc.nextInt();
		int count=0;
	
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("the number of digits is "+count);
		int digitcount=count;
		//int[] temp=num;
		for(int i=0;i<digitcount;i++)
		{
			int[] arr = new int(num);
		}
	}

}
