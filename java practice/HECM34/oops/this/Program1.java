//implicit and explicit necessity of "this" keyword

class A
{
	int x;
	double y;
	A(int x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public void print()
	{
		int x = 100;
		double y = 100.11;
		System.out.println("x = "+x);
		System.out.println("y = "+y);

		System.out.println("x = "+this.x);
		System.out.println("y = "+this.y);

	}
}
class Program1 
{
	public static void main(String[] args) 
	{
		A a1 = new A(10,10.11);
		A a2 = new A(20,20.11);
		A a3 = new A(30,30.11);

		a1.print();
		a2.print();
		a3.print();
	}
}
