class C
{
	C(int a1, double a2)
	{
		System.out.println("int-double args");
	}

	C(double a1, int a2)
	{
		System.out.println("double-int args");
	}
}





class Program10 
{
	public static void main(String[] args) t
	{
		new C(10,10.11);
		new C(10.11,10);
		//new C(10,20); reference to c is ambiguous bcos, int double, double int is also possible. since multiple matches, error is produced
		//new C('A','B'); reference to c is ambiguous
		//new C(3.14f,8.14); argument mismatch
	}
}
