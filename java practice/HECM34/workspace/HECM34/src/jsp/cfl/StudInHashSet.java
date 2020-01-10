package jsp.cfl;

import java.util.*;


public class StudInHashSet
{
	public static void main(String[] args) 
	{
		Set<Student> s=new HashSet<Student>();
		s.add(new Student("Dinga", 10, 87.87));
		s.add(new Student("Binga", 20, 67.87));
		s.add(new Student("Pinga", 30, 57.87));
		s.add(new Student("Singa", 40, 77.87));
		s.add(new Student("Sanga", 50, 47.87));
		
		Iterator<Student> itr = s.iterator();
		while(itr.hasNext())
		{
			Student s1 = itr.next();
			if(s1.getName().startsWith("S"))
			{
				System.out.println(s1);
			}
		}
		
	}

}
