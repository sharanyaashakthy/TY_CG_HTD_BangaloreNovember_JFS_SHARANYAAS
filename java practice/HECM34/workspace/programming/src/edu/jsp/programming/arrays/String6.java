package edu.jsp.programming.arrays;
//converting lower to upper and vice versa
public class String6 
{
	public static void main(String[] args)
	{
		String s="WeLcoMe to JspiDErS";
		char[] ch= s.toCharArray();
		String res="";
		for(int i = 0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
			else if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
			res=res+ch[i];
		}
		System.out.println(res);
	}
}
