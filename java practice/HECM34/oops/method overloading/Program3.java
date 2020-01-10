//overloading main method

class B
{
	public static void main()
	{
		System.out.println("no args main method");
	}

	public static void main(int arg)
	{
		System.out.println("int args main method");
	}

	public static void main(double arg)
	{
		System.out.println("double args main method");
	}

	public static void main(int arg1, double arg2)
	{
		System.out.println("int-double args main method");
	}
	public static void main(String[] args) //main method in class with the standard syntax as jvm
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}
class Program3
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		B.main();
		B.main(10);
		B.main(10.11);
		B.main(10,10.11);
		String[] s = {"Hello ", "world ", "hi ", "bye "};
		B.main(s);//passing the args to main method in class by arrays
		System.out.println("main method ended");
	}

}
