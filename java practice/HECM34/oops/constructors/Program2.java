class A // user defined no arguments constructor can be used to print the same values
{
	int x;
	double y;
	A()//user defined no arguments constructor
	{
		x=10;
		y=10.11;
	}
	
}

class Program2
{
	public static void main(String[] args) 
	{
		A a1=new A();//multiple objects with the same value 
		System.out.println("x = "+a1.x);
		System.out.println("x = "+a1.y);

		A a2=new A();
		System.out.println("x = "+a2.x);
		System.out.println("x = "+a2.y);

		A a3=new A();
		System.out.println("x = "+a3.x);
		System.out.println("x = "+a3.y);

	}
}