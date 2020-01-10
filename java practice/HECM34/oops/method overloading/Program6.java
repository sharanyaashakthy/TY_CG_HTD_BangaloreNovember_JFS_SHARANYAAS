

import java.util.Arrays;
class Program6 
{
	public static void main(String[] args) 
	{
		int[] arg1 = {30,10,20,40,70,60,50};
		double[] arg2 = {20.22,10.22,70.22,60.22,30.22,50.22,40.22};
		char[] arg3= {'A','I','E','O','U'};
		String[] arg4 = {"anandh", "bala","deepak","esha","chand"};

		Arrays.sort(arg1);
		Arrays.sort(arg2);
		Arrays.sort(arg3);
		Arrays.sort(arg4);

		for(int i=0;i<arg1.length;i++)
		{
			System.out.print(arg1[i]+" ");
			
		}
		System.out.println(" ");

		for(int i=0;i<arg2.length;i++)
		{
			System.out.print(arg2[i]+" ");
		
		}
		System.out.println(" ");

		for(int i=0;i<arg3.length;i++)
		{
			System.out.print(arg3[i]+" ");
			
		}
		System.out.println(" ");

		for(int i=0;i<arg4.length;i++)
		{
			System.out.print(arg4[i]+" ");
		
		}
		System.out.println(" ");

		
		
	}
}
