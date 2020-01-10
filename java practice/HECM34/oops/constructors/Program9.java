//passing only the suitable arguments to the user defined parameterized constructor
class B
{
	B()
	{
		System.out.println("no arguments");
	}

	B(int arg)
	{
		System.out.println("int arguments");
	}

	B(double arg)
	{
		System.out.println("double arguments");
	}

	B(int arg1, double arg2)
	{
		System.out.println("int-double arguments");
	}

}
class Program9 
{
	public static void main(String[] args) 
	{
		new B();
		new B(10);
		new B(10.11);
		new B(10,10.11);
		new B('A');
		new B(3.14f);
		new B(1000l);
		new B(10,20);
		new B('A','B');
		//new B(10,20,30); error bcoz no suitable constructors  found. (differ in length)
		//new B(10.11,20.11,30.11); incompatible types error
		//new B(3.14f,100.11);  same error
		
	}
}
