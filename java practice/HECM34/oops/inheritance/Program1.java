//single inheritance
class A 
{
	int x=10;
	double y=10.11;
	public void print()
	{
		System.out.println("hello");
	}
}
class B extends A
{
	int m=100;
	double n=100.11;
	public void disp()
	{
		System.out.println("hi");
	}
}
class Program1
{
	public static void main(String[] args)
	{
		A a=new A();
		System.out.println("a.x = "+a.x);
	    System.out.println("a.y = "+a.y);
		a.print();

		B b = new B();
		System.out.println("b.m = "+b.m);
	    System.out.println("b.n = "+b.n);
		b.disp();

		System.out.println("b.x = "+b.x);
	    System.out.println("b.y = "+b.y);
		b.print();


		
	}
}


