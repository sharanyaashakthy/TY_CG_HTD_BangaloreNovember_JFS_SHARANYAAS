//"super" keyword usage

class Parent
{
	int x = 10;
	double y = 10.11;

	public void disp()
	{
		System.out.println("In parent class");
	}
}
class Child extends Parent
{
	int x = 100;
	double y = 100.11;
	public void print()
	{
		int x= 1000;
		double y = 1000.11;
		System.out.println(super.x);
		System.out.println(super.y);

		System.out.println(this.x);
		System.out.println(this.y);

		System.out.println(x);
		System.out.println(y);
		super.disp();
	}
}
class Program5
{
	public static void main(String[] args) 
	{
	Child c = new Child();
	c.print();
	}
}























