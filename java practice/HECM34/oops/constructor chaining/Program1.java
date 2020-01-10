//implicit constructor chaining
class A
{
	A()
	{
		super();//optional//it goes to its super class Object to execute that first and then returns back.//IMPLICIT CONSTRUCTOR CHAINING
		System.out.println("In super class");
	}
}
class B extends A
{
	B()
	{
		super();//optional//it goes to its super class A to execute first//IMPLICIT CONSTRUCTOR CHAINING
		System.out.println("In sub class");
	}
}
class Program1
{
	public static void main(String[] args) 
	{
		new B();//object creation is for executing the constructor
	}
}
