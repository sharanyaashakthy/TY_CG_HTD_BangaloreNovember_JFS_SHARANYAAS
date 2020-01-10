
package edu.jsp.programming.arrays;

public class String2
{
	public static void main(String[] args) 
	{
		String s = "Hello Welcome To JSP";
		char[] ch= s.toCharArray();
		
		int Ucount=0,Lcount=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' )
			{
				System.out.print(ch[i]);
				Ucount++;
				
			}
			else if(ch[i]>='a' && ch[i]<='z') 
			{
				System.out.print(ch[i]);
				Lcount++;
				
				
			}
			
		}
		System.out.println(Ucount++);
		System.out.println(Lcount++);
		
	}

}
