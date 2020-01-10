class StringBuffer //doubt
{
	public static void print()
	{
		System.out.println("hi");
	}
}

class B extends StringBuffer
{
	public static void view()
	{
		System.out.println("bye");
	}
}
class Program6
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B.view();
		B.print();
		StringBuffer.print();

	}
}
