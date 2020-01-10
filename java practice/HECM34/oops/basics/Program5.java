class Program5 
{
	public static void main(String[] args) 
	{
		//System.out.println("sum = "+Calculator.add(20,10));
		Calculator.add(20,10);
		System.out.println("minus = "+Calculator.minus(20,10));
		System.out.println("prod = "+Calculator.prod(20,10));
		System.out.println("div = "+Calculator.div(20,10));
		System.out.println("mod = "+Calculator.mod(20,10));
	}
}
class Calculator
{
	public static void add(int x, int y)
	{
		int addres=x+y;
		System.out.println("The addition result is "+addres);
		//return addres;
	}
	public static int minus(int x, int y)
	{
		int minusres=x-y;
		System.out.println("The minus result is "+minusres);
		return minusres;
	}
	public static int prod(int x, int y)
	{
		int prodres=x*y;
		System.out.println("The product result is "+prodres);
		return prodres;
	}
	public static int div(int x, int y)
	{
		int divres=x/y;
		System.out.println("The division result is "+divres);
		return divres;
	}
	public static int mod(int x, int y)
	{
		int modres=x%y;
		System.out.println("The modulo result is "+modres);
		return modres;
	}
}

