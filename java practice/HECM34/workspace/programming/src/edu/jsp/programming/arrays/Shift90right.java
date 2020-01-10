package edu.jsp.programming.arrays;
import java.util.Scanner;
public class Shift90right
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
				//System.out.println("enter the "+i+" for row values");
				for(int j=0;j<col;j++)
				{
					//System.out.println("enter the "+j+" for column values");
					arr[i][j]=sc.nextInt();
					
				}
			}
			System.out.println("Matrix array Before reverse");
			System.out.println("---------------------------");
			
			for(int i =0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			//logic to perform column reverse
			for(int i=0;i<row/2;i++)
			{
				for(int j=0;j<col;j++)
				{
					int temp=arr[i][j];
					arr[i][j]=arr[row-1-i][j];
					arr[row-1-i][j]=temp;
				}
			}
			
			System.out.println("Matrix array after Column reverse");
			System.out.println("------------------------------");
			for(int i =0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			//Transpose logic
			int[][] res = new int[col][row];
			for(int i=0;i<col;i++)
			{
				for(int j=0;j<row;j++)
				{
					res[i][j]=arr[j][i];
					
				}
				
			}
			System.out.println("Matrix array after 90 degree right shift");
			System.out.println("---------------------------------------");
			for(int i=0;i<col;i++)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(res[i][j]+" ");
					
				}
				
				System.out.println();
				sc.close();
				
			}
			
		}
			
}
