//passing object and returning nothing
class Test 
{
	int x,y;
	Test(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Demo
{
	public void modify(Test t)
	{
		System.out.println(t.x);//10
		System.out.println(t.y);//20
		t.x=100;//re-initialization
		t.y=200;
	}
}
class Example3
{
	public static void main(String[] args)
	{
		Test t = new Test(10,20);
		System.out.println(t.x);//10
		System.out.println(t.y);//20
		new Demo().modify(t);//passing object(reference variable t) to the method modify
		System.out.println(t.x);//100
		System.out.println(t.y);//200

	}
}
