
//cyclic inheritance error checking
class A extends B // cyclic inheritance involving A is the error
{
	public static void m1()
	{
		System.out.println("hi");
	}
}

class B extends A 
{
	public static void m2()
	{
		System.out.println("bye");
	}
}

class Program7
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B.m2();
		B.m1();
		A.m1();
	}
}
