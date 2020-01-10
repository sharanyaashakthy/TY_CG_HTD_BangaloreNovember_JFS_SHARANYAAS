//explicit constructor chaining

class A
{
	A(int arg)
	{
		System.out.println("In super class int arg constructor");
	}
	A(double arg)
	{
		this(10);
		System.out.println("In super class double arg constructor");
	}

}
class B extends A
{
	B(double arg)
	{
		super(10.67);
		System.out.println("In sub class");

	}
}

class Program2 
{
	public static void main(String[] args) 
	{
		new B(89.86);
	}
}
