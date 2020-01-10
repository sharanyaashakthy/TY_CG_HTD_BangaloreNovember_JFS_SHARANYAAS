class A 
{
	int x;
	double y;
	A()//user defined no arguments constructor
	{
		x=10;//assigning the values
		y=10.11;
	}

	
}

class Program1
{

	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println(a.x);//printing the values
		System.out.println(a.y);
	}
}