class A // user defined arguments constructor can be used to print the different values
{
	int x;
	double y;

	A(int a, double b)//user defined arguments constructor
	{
		x=a;
		y=b;
	}
	
}

class Program3
{
	public static void main(String[] args) 
	{
		A a1=new A(20,20.11);//multiple objects with different values 
		System.out.println("x = "+a1.x);
		System.out.println("y = "+a1.y);

		A a2=new A(30,30.11);
		System.out.println("x = "+a2.x);
		System.out.println("y = "+a2.y);

		A a3=new A(40,40.11);
		System.out.println("x = "+a3.x);
		System.out.println("y = "+a3.y);

	}
}
