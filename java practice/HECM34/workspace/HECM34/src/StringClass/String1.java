package StringClass;

public class String1 
{
	public static void main(String[] args)
	{
		String s1= new String("hello");
		String s2= new String("hello");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true,since it is overridden
		
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false, it calls the object class equals method
		
		StringBuilder sr1=new StringBuilder("hello");
		StringBuilder sr2=new StringBuilder("hello");
		System.out.println(sr1==sr2);//false
		System.out.println(sr1.equals(sr2));//false, it calls the object class equals method
		
		
		
		
		
	}

}
