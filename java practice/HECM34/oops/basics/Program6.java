class Test  
{
	public int x=10;
	public void print()
	{
		System.out.println("non static print method");
	}

}
class Program6
{
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println("x= "+t.x);
		t.print();
	}
}
