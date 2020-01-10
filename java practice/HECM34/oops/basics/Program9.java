class A 
{
	public int x=10;
	public void m1()
	{
		System.out.println("running m1 method");
	}
	
}

class Program9
{
	public static void main(String[] args)
	{
		//A a=new A();
		//System.out.println("x = "+a.x);
		//a.m1();

		A a=null;/* null pointer exception will be produced because, we try to access the non-static members by the reference variable
		whose vallue is assigned to null.*/
		System.out.println("x = "+a.x);
		a.m1();
		



	}
}
