package edu.jsp.programming.arrays;

public class String4
{
	public static void main(String[] args)
	{
		String s="Hello welcome to JSP";
		char[] ch= s.toCharArray();
		int Wcount=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				Wcount++;
		}
		System.out.println(Wcount++);
		
	}

}
