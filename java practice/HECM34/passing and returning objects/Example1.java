// passing nothing and returning object

class  Test
{
	public void print()
	{
		System.out.println("Hello World!");
	}
}
class Demo
{
	public	Test getobject()
	{
		return new Test();//returns the object of test class
	}
}
class Example1
{
	public static void main(String[] args)
	{
		/*Demo d = new Demo();
		Test t = d.getobject();
		t.print();

		Demo d = new Demo();
		d.getobject().print();*/

		new Demo().getobject().print(); // shortcut for the method invocation
	}
}
