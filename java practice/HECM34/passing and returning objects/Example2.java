//passing nothin and returning object

class Test 
{
	public  void print()
	{
		System.out.println("Hello World!");
	}
}
class Demo
{
	public static Test getobject() // static method 
	{
		return new Test();

	}
}
class Example2
{
	public static void main(String[] args)
	{
		/*
		Test t = Demo.getobject();
		t.print();
		*/

		Demo.getobject().print(); // Demo is the class name used to access the static method
	}
}
