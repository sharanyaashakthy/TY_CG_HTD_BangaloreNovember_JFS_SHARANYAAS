
//when an outer class is declared as public, the sourcefile name must be the same as the public class name
public class A
{
	public static void print()
	{
	System.out.println("Hi!");
	}
}
class B
{
	public static void disp()
	{
	System.out.println("Hello!");
	}
}
class c 
{
	public static void main(String[] args) 
	{
		A.print();
		B.disp();
		System.out.println("Hello World!");
	}
}
