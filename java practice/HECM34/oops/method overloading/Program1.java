//overloading static method
class A
{
	public static void m1()
	{
		System.out.println("no args");
	}

	public static void m1(int arg)
	{
		System.out.println("int args");
	}

	public static void m1(double arg)
	{
		System.out.println("double args");
	}

	public static void m1(int arg1, double arg2)
	{
		System.out.println("int-double args");
	}
}
class Program1 
{
	public static void main(String[] args) 
	{
		A.m1();
		A.m1(10);
		A.m1(10.11);
		A.m1(10,10.11);
		A.m1('A');//maps to int
		A.m1(3.14f);//maps to double
		A.m1(10,20);//maps to int-double
		//A.m1(10,20,30);
	}
}
