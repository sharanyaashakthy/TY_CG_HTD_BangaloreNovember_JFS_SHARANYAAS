
//constructor calling using this() within the same class among different constructors
class Test
{
	Test()
	{
		//this(); // Recursive constructor invocation error is produced
		System.out.println("no arg constructor");
	}
	Test(int arg)
	{
		this();
		System.out.println("int arg constructor");
	}
	Test(double arg)
	{
		this(10);
		System.out.println("double arg constructor");
	}
}

class Program1 
{
	public static void main(String[] args) 
	{
		new Test(10.98);//since it has double arg value, it first goes to the Test(double arg)
	}
}
