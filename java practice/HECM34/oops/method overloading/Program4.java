//passing multiple array values 
class Demo
{
	public static void main(int[] args) 
	{
		System.out.println("int[] main method");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	public static void main(double[] args) 
	{
		System.out.println("double[] main method");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	public static void main(char[] args) 
	{
		System.out.println("char[] main method");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("String[] main method");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}

}
class Program4 
{
	public static void main(String[] args) 
	{
		int[] i = {10,20,30};
		double[] d = {10.11, 20.11, 30.11};
		char[] c = {'A','B','C', 'a', 'b', 'c'};
		String[] s = {"hello ","hi ","bye"};

		//passing the array elements
		Demo.main(i);
		Demo.main(d);
		Demo.main(c);
		Demo.main(s);
	}
}
