package edu.jsp.programming.arrays;

public class String10
{
	public static void main(String[] args)
	{
		String s="consistency over intensity";
		char[] ch= s.toCharArray();
		String res="";
		for(int i=ch.length-1;i>=0;i++)
		{
			int j=i;
			while(i>0 && ch[i]!=' ')
				i--;
			int k=i+1;
			while(k<=j)
			{
				res=res+ch[k];
				k++;
			}
			if(i>0)
				res=res+ch[i];
		}
		System.out.println(res);
	}
	

}

