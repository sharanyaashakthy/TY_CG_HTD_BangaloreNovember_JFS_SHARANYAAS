//multi-level inheritance
class X 
{
	int a=10;
	public static void print()
	{
		System.out.println("no-args");
	}
}

class Y extends X 
{
	double b=10.11;
	public static void print(int m)
	{
		System.out.println("int arg "+m);
	}
}

class Z extends Y
{
	char c='A';
	public static void print(int num1, int num2)
	{
		System.out.println("int-int args "+num1 +" " +num2);
	}
}

class Program2
{
	public static void main(String[] args)
	{
		X x = new X();
		System.out.println("x.a = "+x.a);
		X.print();

		Y y = new Y();
		System.out.println("y.b = "+y.b);
		Y.print(10);

		System.out.println("y.a = "+y.a);
		Y.print();

		Z z = new Z();
		System.out.println("z.c = "+z.c);
		Z.print(10,20);

		System.out.println("z.b = "+z.b);
		Z.print(10);

		System.out.println("z.a = "+z.a);
		Z.print();


	}
}
