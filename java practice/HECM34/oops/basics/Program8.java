class A
{
	int x=10;
	
}
class Program8
{
	public static void main(String[] args) 
	{
		
		A a1= new A ();
	    A a2=a1;
		A a3=a2;

	
	//A a1,a2,a3;  A a= new A ();
	//a1=new A();  A a2=a1;
	//a2=a1;		 A a3=a2;
	//a3=a2;
	System.out.println("x = " +a1.x);
	System.out.println("x= " +a2.x);
	System.out.println("x = "+a3.x);
	
	a1.x=1000;

	System.out.println("x = "+a1.x);
	System.out.println("x = "+a2.x);
	System.out.println("x = "+a3.x);
	}
}

