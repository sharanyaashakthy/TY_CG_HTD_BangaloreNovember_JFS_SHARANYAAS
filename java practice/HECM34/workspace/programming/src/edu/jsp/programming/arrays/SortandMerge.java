package edu.jsp.programming.arrays;
import java.util.Scanner;
public class SortandMerge 
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
				
				sort(a);
				sort(b);
				
				int i=0,j=0,k=0;
				int[] res = new int[a.length + b.length];
				
				while(i<a.length && j<b.length)
				{
					if(a[i]<=b[j])
						res[k++]=a[i++];
					else
						res[k++]=b[j++];
				}
				while(j<b.length)
					res[k++]=b[j++];
				while(i<a.length)
					res[k++]=a[i++];
				
				System.out.println("sorted and merged array elements are " );
				for(int l=0;l<res.length;l++)
				{
					
					System.out.print(res[l]+ " ");
				}
				
			}
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
				
		}
	}
}

