//similar to program4
class Test
{
	public static void main(int[] arg1, double[] arg2, char[] arg3, String[] arg4)
	{
		for(int i=0;i<arg1.length;i++)
		{
			System.out.println(arg1[i]);
		}

		for(int i=0;i<arg2.length;i++)
		{
			System.out.println(arg2[i]);
		}
		for(int i=0;i<arg3.length;i++)
		{
			System.out.println(arg3[i]);
		}
		for(int i=0;i<arg4.length;i++)
		{
			System.out.println(arg4[i]);
		}
	}
}

class Program5 
{
	public static void main(String[] args) 
	{
		int[] i = {10,20,30};
		double[] d = {10.11, 20.11, 30.11};
		char[] c = {'A','B','C', 'a', 'b', 'c'};
		String[] s = {"hello ","hi ","bye"};
       
	   //passing array as whole

	   Test.main(i,d,c,s);
	}
}
