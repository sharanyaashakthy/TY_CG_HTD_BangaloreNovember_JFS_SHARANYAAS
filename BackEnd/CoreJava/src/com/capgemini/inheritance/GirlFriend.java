//using the this keyword
class GirlFriend 
{
	String name;
	String companyName;
	double salary;

	GirlFriend(String name,String companyName, double salary)
	{
		this.name = name;
		this.companyName = companyName;
		this.salary = salary;
	}

}
class MainGirlFriend
{
	public static void main(String[] args)
	{
		GirlFriend gf = new GirlFriend("Shakthy", "HP", 80000.00);
		System.out.println("Name is "+gf.name);
		System.out.println("Company Name is "+gf.companyName);
		System.out.println("Salary is "+gf.salary);
	}
}
/*
D:\java practice\javaQsp>javac GirlFriend.java

D:\java practice\javaQsp>java MainGirlFriend
Name is Shakthy
Company Name is HP
Salary is 80000.0
*/
