package edu.jsp.programming.arrays;

public class String5
{
	public static void main(String[] args)
	{
		String s="Hello			welcome			to			JSP";
		char[] ch= s.toCharArray();
		String res="";
		for(int i = 0;i<ch.length;i++)
		{
			while(i<ch.length && ch[i]!=' ')
			{
				res=res+ch[i++];
				break;
			}
			while(i<ch.length && ch[i]==' ' && ch[i+1] ==' ')
			{	
				i++;
			}
			res=res+ch[i];
		}
		
		//System.out.println(s);
		System.out.println(res);
	}

}
