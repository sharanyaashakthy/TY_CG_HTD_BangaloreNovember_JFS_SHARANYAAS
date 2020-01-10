//overloading non-static method
class B
{
	public  void m1()
	{
		System.out.println("no args");
	}

	public  void m1(int arg)
	{
		System.out.println("int args");
	}

	public  void m1(double arg)
	{
		System.out.println("double args");
	}

	public  void m1(int arg1, double arg2)
	{
		System.out.println("int-double args");
	}
}

class Program2 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1();
		b.m1(10);
		b.m1(10.11);
		b.m1(10,10.11);

	}
}
