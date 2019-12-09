//super and this method
class Father 
{

	Father()
	{
		System.out.println("A");
	}

	Father(String fatherName, int fatherAge )
	{
		this();
		System.out.println("B");
	}
}
class Son extends Father
{
	Son()
	{
		super("Arun", 45);
		System.out.println("C");
	}

	Son(String sonName, int sonAge)
	{
		this();
		System.out.println("D");
	}
}
class MainFather
{
	public static void main(String[] args)
	{
		Son s = new Son("Arunraj", 23);
	}
}
/*
D:\java practice\javaQsp>javac Father.java

D:\java practice\javaQsp>java MainFather
A
B
C
D
*/
