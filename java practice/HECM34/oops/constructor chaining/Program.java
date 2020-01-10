// use of both implicit and explicit constructor chaining
class A
{
	A()
	{
		this(23.34);
		System.out.println("In class A no-arg constructor");

	}
	A(double arg)
	{
		System.out.println("In class A double-arg constructor");

	}
}
class B extends A
{
	B()
	{
		System.out.println("In class B  constructor");

}
class C extends B
{
	C()
	{
		System.out.println("In class C constructor");
	}
}
class D extends C
{
	D(int arg)
	{
		super();//optional
		System.out.println("In class D constructor");
	}
}
class Program3
{
	public static void main(String[] args)
	{
	new D(67);
	}
}































