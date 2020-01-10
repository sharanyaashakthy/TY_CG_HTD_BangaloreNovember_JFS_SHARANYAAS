package edu.jsp.programming.arrays;

import java.util.Scanner;

public class TwoDimensionalMatrixRepresentation 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the row");
		int row= sc.nextInt();
		
		System.out.println("enter the size of the column");
		int col= sc.nextInt();
		
		int[][] arr = new int[row][col];
		System.out.println("enter the array elements");
		
		for(int i=0;i<row;i++)
		{
			System.out.println("enter the "+i+" for row values");
			for(int j=0;j<col;j++)
			{
				System.out.println("enter the "+j+" for column values");
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Matrix array");
		System.out.println("------------");
		
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}