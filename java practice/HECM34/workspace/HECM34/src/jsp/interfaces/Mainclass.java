package jsp.interfaces;

public class Mainclass 
{
	public static void main(String[] args)
	{
		B b = new B();
		b.print();
		System.out.println("x = "+A.x);
		System.out.println(A.x+1);
		//A.x=100; error bcos it is final by default and cant be re-assigned.
	}

}
