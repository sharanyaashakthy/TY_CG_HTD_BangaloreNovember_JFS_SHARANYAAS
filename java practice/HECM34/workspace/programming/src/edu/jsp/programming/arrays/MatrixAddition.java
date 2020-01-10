package edu.jsp.programming.arrays;

import java.util.Scanner;

public class MatrixAddition 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the size of the row");
	int row= sc.nextInt();
	
	System.out.println("enter the size of the column");
	int col= sc.nextInt();
	
	int[][] A = new int[row][col];
	int[][] B = new int[row][col];
	int[][] Res = new int[row][col];
	
	System.out.println("enter the array elements for A");
	
	for(int i=0;i<row;i++)
	{
		System.out.println("enter the "+i+" for row values");
		for(int j=0;j<col;j++)
		{
			System.out.println("enter the "+j+" for column values");
			A[i][j]=sc.nextInt();
			
		}
	}

	System.out.println("Matrix array A");
	System.out.println("------------");
	
	for(int i =0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(A[i][j]+" ");
		}
		System.out.println();
	}
	
	
	System.out.println("enter the array elements for B");
	
	for(int i=0;i<row;i++)
	{
		System.out.println("enter the "+i+" for row values");
		for(int j=0;j<col;j++)
		{
			System.out.println("enter the "+j+" for column values");
			B[i][j]=sc.nextInt();
			
		}
	}

	System.out.println("Matrix array B");
	System.out.println("------------");
	
	for(int i =0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(B[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("Array Result");
	

	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			
			Res[i][j] = A[i][j] + B[i][j];
			
		}
	}

	System.out.println("Matrix array Result");
	System.out.println("-------------------");
	for(int i =0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(Res[i][j]+" ");
		}
		System.out.println();
	}
	

  }
}