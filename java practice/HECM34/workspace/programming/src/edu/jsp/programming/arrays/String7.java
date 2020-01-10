package edu.jsp.programming.arrays;
//converting initial letters upper case and retaining other char as itself
public class String7
{
	public static void main(String[] args)
	{
		String s="WeLcoMe to JspiDErS";
		char[] ch= s.toCharArray();
		String res="";
		for(int i = 0;i<ch.length;i++)
		{
			if(i==0 || ch[i]!=' ' && ch[i-1] == ' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
				
			}
			res=res+ch[i];
		}
		System.out.println(res);
			
	}

}
