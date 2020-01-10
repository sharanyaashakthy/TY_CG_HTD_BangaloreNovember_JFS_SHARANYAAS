package edu.jsp.programming.arrays;

public class String1
{
	public static void main(String[] args)
	{
		String s= "hello wel$come to jspiders%";
		char[] ch=s.toCharArray();
		int aCount=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
			{
				aCount++;
				
			}
			
		}
		System.out.println(aCount);
	}

}
