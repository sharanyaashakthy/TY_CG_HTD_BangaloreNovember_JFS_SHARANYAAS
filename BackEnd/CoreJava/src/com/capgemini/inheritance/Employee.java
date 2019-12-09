class Employee 
{
	String empName;
	int empAge;
	double empSal;

	Employee(String name, int age, double sal)
	{
		empName = name;
		empAge = age;
		empSal = sal;
	}
	void Details()
	{
		System.out.println("name is "+  empName +"and the age is "+empAge+" and is earning "+empSal );

	}
	
}
class MainEmployee
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("John", 23, 45000.00);
		emp.Details();
		
		
	}
}
/*
D:\java practice\javaQsp>javac Employee.java

D:\java practice\javaQsp>java MainEmployee
name is Johnand the age is 23 and is earning 45000.0 */
