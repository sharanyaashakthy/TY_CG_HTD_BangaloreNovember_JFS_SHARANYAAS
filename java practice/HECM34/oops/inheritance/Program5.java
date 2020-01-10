//to check for successful compilation by writing extens object while coding 


class A extends Object 
{
	public static void disp() 
	{
		System.out.println("Hello World!");
	}
}
class B extends A
{
	public static void print() 
	{
		System.out.println("Hi!");
	}

}
class Program5
{
	public static void main(String[] args)
	{
		System.out.println("main method");
		B.print();
		B.disp();
		A.disp();
	}
}
