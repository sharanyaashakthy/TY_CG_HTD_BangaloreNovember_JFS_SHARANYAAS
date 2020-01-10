
//Hierachical inheritance
class M
{
	int a=1000;
	public static void disp()
	{
		System.out.println("no args of superclass m");
	}

}
class X extends M
{
	int b=10;
	public static void disp(int num1)
	{
		System.out.println("int num1 = "+num1);
	}
}

class Y extends M
{
	double c=10.11;
	public static void disp(double num2)
	{
		System.out.println("double num2 = "+num2);
	}
}
class Z extends M
{
	char d='A';
	public static void disp()
	{
		System.out.println("no args of subclass z");
	}
}

class Program4 
{
	public static void main(String[] args) 
	{
		M m = new M();
		System.out.println("m.a= "+m.a);
		M.disp();

		X x = new X();
		System.out.println("x.b = "+x.b);
		X.disp(100);

		System.out.println("x.a = "+x.a);
		Z.disp();


		Y y = new Y();
		System.out.println("y.c = "+y.c);
		Y.disp(100.11);

		System.out.println("y.a = "+y.a);
		Z.disp();

		Z z = new Z();
		System.out.println("z.d = "+z.d);
		Z.disp();

		System.out.println("z.a = "+z.a);
		Z.disp();

	}
}
