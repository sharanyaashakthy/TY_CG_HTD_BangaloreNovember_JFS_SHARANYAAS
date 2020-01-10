class Program5 // re-assigning the value of non-static dm everywhere in the program produces error except for n.s dm and n.s method
{
		int x=0;

	static
	{
		//x=10;//error bcos non=static dm cant be re-assigned here
		//System.out.println("x = "+x);//
	}

	{
		 x=20;
		System.out.println("x = "+x);
		
	}

	public static void main(String[] args) 
	{
		// x=30;//error bcos non=static dm cant be re-assigned here
		//System.out.println("x = "+x);//
		Program5 p=new Program5();
		p.m2();
	}

	public void m2()
	{
		x=40;
		System.out.println("x = "+x);

	}
	


}

