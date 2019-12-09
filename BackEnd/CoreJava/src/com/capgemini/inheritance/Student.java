//checking the output for initialized and un-initialized values 
class Student 
{
	String studName;
	int studAge;

	Student()
	{

	}
	Student(String name, int age)
	{
		studName = name;
		studAge = age;
	}
}

class MainStudent
{
	public static void main(String arr[])
	{
		Student s = new Student();
		System.out.println(s.studName);
		System.out.println(s.studAge);

		Student s1 = new Student("Shakthy", 22);
		System.out.println(s1.studName);
		System.out.println(s1.studAge);
	}
}
/*
D:\java practice\javaQsp>javac Student.java

D:\java practice\javaQsp>java MainStudent
null
0
Shakthy
22
*/
