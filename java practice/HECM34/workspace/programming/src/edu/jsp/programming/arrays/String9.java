package edu.jsp.programming.arrays;

public class String9
{
	public static void main(String[] args)
	{
		String s="consistency over intensity";
		char[] ch= s.toCharArray();
		String res="";
		for(int i = 0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
				i++;
			int j=i-1;
			while(j>=k)
			{
				res=res+ch[j];
				j--;
			}
			if(i<ch.length)
				res=res+ch[i];
		}
		System.out.println(res);
	}
	

}
