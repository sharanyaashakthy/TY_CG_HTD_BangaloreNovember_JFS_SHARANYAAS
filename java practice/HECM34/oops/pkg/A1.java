//declaring two outer class as public is INVALID and it will keep producing error
public class A1
{
	public static void print()
	{
	System.out.println("Hi!");
	}
}
public class B1
{
	public static void disp()
	{
	System.out.println("Hello!");
	}
}
class c1 
{
	public static void main(String[] args) 
	{
		A.print();
		B.disp();
		System.out.println("Hello World!");
	}
}




