//this is an oridinary scenario where the class name can be saved with anyname. But for compilation, main method class must be given
class X
{
	public static void view()
	{
		System.out.println("Hello World!");
	}

}
class Y
{
	public static void disp()
	{
		System.out.println("Hii!");
	}
}

class Z
{
	public static void main(String[] args) 
	{
		X.view();
		Y.disp();
	}
}
