
class Test
{
	int x;
	Test(int x)
	{
		this.x = x;
	}

	public int getx()
	{
		return x;
	}
	public void setx(int x)
	{
		this.x = x;
	}
}
class Program4
{
	public static void main(String[] args) 
	{
		Test t1= new Test(10);
		System.out.println(t1.getx());

		Test t2= new Test(20);
		System.out.println(t2.getx());

		t1.setx(100);
		System.out.println(t1.getx());

		t2.setx(200);
		System.out.println(t2.getx());


	}
}
