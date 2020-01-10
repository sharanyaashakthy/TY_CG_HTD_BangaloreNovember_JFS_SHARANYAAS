class  Student
{
	String name;
	int id;
	double marks;

	Student(String name, int id, double marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	
}

class Program4
{
	public static void main(String[] args) 
	{
		Student s1= new Student("Dinga", 10, 78.87);
		Student s2= new Student("Dingi", 20, 88.87);
		Student s3= new Student("Binga", 30, 58.87);
		Student s4= new Student("Bingi", 40, 48.87);

		System.out.println("STUDENT DETAILS");
		System.out.println("-------------------------------");
		System.out.println("Name = "+s1.name);
		System.out.println("id = "+s1.id);
		System.out.println("marks = "+s1.marks);
		System.out.println();

		System.out.println("Name = "+s2.name);
		System.out.println("id = "+s2.id);
		System.out.println("marks = "+s2.marks);
		System.out.println();

		System.out.println("Name = "+s3.name);
		System.out.println("id = "+s3.id);
		System.out.println("marks = "+s3.marks);
		System.out.println();

		System.out.println("Name = "+s4.name);
		System.out.println("id = "+s4.id);
		System.out.println("marks = "+s4.marks);



	}
}