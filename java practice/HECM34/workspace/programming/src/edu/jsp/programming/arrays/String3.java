package edu.jsp.programming.arrays;

public class String3 
{
	public static void main(String[] args) 
	{
		String s="Hello welcome to JSP";
		char[] ch= s.toCharArray();
		
		int Vcount=0,Ccount=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A' || ch[i]=='a' || ch[i]=='E' || ch[i]=='e' || ch[i]=='I' || ch[i]=='i' || ch[i]=='O' || ch[i]=='o'|| ch[i]=='U' ||ch[i]=='u')
					Vcount++;
			else if (ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
					Ccount++;
		}
		System.out.println(Vcount++);
		System.out.println(Ccount++);
		
	}
}
