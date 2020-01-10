//usage of local + super + this keyword 

class Calculator
{
	int x = 10;
	double y = 10.11;
}
class Add extends Calculator
{
	int x = 100;
	double y = 100.11;

	public void sum()
	{
		int x = 1000;
		double y = 1000.11;

		this.x = x+this.x+super.x;
		this.y = y+this.y+super.y;
	}

	public void disp()
	{
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
class Program6 
{
	public static void main(String[] args) 
	{
		Add a = new Add();
		a.sum();
		a.disp();
	}
}
