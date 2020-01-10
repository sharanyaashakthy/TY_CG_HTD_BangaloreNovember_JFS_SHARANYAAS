//use of "this" keyword for differentiating the instance and the local variables

class Student
{
	String name;
	int id;
	double marks;

	Student(String name, int id, double marks)
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public void print()
	{
		String name = "shyam";
		int id = 1;
		double marks = 89.78;

		System.out.println("local name = "+name);
		System.out.println("local id = "+id);
		System.out.println("local marks = "+marks);

		System.out.println("Instance name = "+this.name);
		System.out.println("Instance id = "+this.id);
		System.out.println("Instance marks = "+this.marks);
	}
}
class Program2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Dinga", 2, 78.87);
		Student s2 = new Student("Dingi", 3, 67.89);
		Student s3 = new Student("Binga", 4, 98.89);
		
		s1.print();
		System.out.println();

		s2.print();
		System.out.println();

		s3.print();
		System.out.println();
	}
}
