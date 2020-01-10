//another example of constructor calling with different flow of execution

class Test
{
	Test()
	{
		System.out.println("no arg constructor");
	}
	Test(int arg)
	{
		this(32,65.78);
		System.out.println("int arg constructor");
	}
	Test(double arg)
	{
		this(65);
		System.out.println("double arg constructor");
	}
	Test(int arg1, double arg2)
	{
		this();
		System.out.println("int-double arg constructor");
	}

}
class Program2 
{
	public static void main(String[] args) 
	{
		new Test(54.32);// since it is an double here, it goes to the Test(double arg) at first
	}
}
