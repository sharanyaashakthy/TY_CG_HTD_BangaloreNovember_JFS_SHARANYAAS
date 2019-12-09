//single inheritance
class Calc 
{
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}
}

class ScientificCalc extends Calc
{

}

class MainCalc
{
	public static void main(String[] arr)
	{
		ScientificCalc sc = new ScientificCalc();
		sc.sum(10,10);
		sc.sub(10,10);
		sc.mul(10,10);
	}
}
/*
D:\java practice\javaQsp>javac Calc.java

D:\java practice\javaQsp>java MainCalc
20
0
100
*/