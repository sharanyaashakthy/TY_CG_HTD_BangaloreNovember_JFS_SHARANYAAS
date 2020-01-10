package jsp.cfl;

import java.util.*;

public class StudentGeneric2 
{
	public static void main(String[] args)
	{

		List<Student> l=new ArrayList<Student>();
		l.add(new Student("Dinga", 10, 87.87));
		l.add(new Student("Binga", 20, 67.87));
		l.add(new Student("Pinga", 30, 57.87));
		l.add(new Student("Singa", 40, 77.87));
		l.add(new Student("Sanga", 50, 47.87));
		
		System.out.println("Displaying the student name starting with s");
		for(int i=0;i<l.size();i++)
		{
			Student s = l.get(i);
			if(s.getName().startsWith("S"))
			{
				System.out.println(s);
			}
		}
		System.out.println();
		
		
		System.out.println("Displaying the marks>55");
		for(int i=0;i<l.size();i++)
		{
			Student s = l.get(i);
			if(s.getMarks() > 55)
			{
				System.out.println(s);
			}
		}
		
	}

}
