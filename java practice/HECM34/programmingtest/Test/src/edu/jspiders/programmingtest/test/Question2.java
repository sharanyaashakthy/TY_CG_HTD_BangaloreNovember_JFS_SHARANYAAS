package edu.jspiders.programmingtest.test;

/*
 * Print the Given sequence using recursive call
 * 1A2b3C4d.....
 * Declare your own variables required for the execution of the code
 * 
 * marks --> 3
 */

public class Question2 
{
	public static void main(String[] args) 
	{
		int length = Integer.parseInt(args[0]);
		
		printSequence(length);
	}

	static void printSequence(int length) 
	{
		int n=1;
		char c1='A', c2='a';
		for(int i=0;i<length;i++)
		{
			if(i%2 !=0)
				System.out.print(n++);
			else if(i%2==0)
			{
				System.out.print(c1++);
				c2++;
			}
			else
				System.out.println(c2++);
					
		}
	}
}