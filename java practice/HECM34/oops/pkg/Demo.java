//This is a default outer class and it can be saved with anyname.
class Demo 
{
	public class Test//public INNER class. So its not compulsory to save with this class name
	{
			public static void print()
			{
				System.out.println("Hello World!");
			}
	}
}
class Demo1
{
	public static void main(String[] args)
	{
		Demo.print();
	}
}
