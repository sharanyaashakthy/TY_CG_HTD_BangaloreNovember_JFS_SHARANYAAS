//initializing the super classs through the subclass by using the constructor chaining
class A
{
	int x,y;
	A(int x, int y)
	{
		this.x = x;
		this.y = y;

	}
}
class B extends A
{
	B(int x, int y)
	{
		super(x,y);
	}
	public void sum()
	{
		System.out.println("sum = "+(x+y));
	}
}

class Program4
{
	public static void main(String[] args) 
	{
		B b = new B(10,20);
		b.sum();
	}
}
