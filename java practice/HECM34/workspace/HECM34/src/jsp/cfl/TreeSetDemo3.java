package jsp.cfl;

import java.util.*;

public class TreeSetDemo3 
{
	public static void main(String[] args) 
	{
		NavigableSet<StudentTreeSetDemo3> s = new TreeSet <StudentTreeSetDemo3> (new StudentTreeSetDemo3());
		
		
		s.add(new StudentTreeSetDemo3("Dinga", 10, 87.87));
		s.add(new StudentTreeSetDemo3("Binga", 20, 67.87));
		s.add(new StudentTreeSetDemo3("Ainga", 30, 57.87));
		s.add(new StudentTreeSetDemo3("Cinga", 40, 77.87));
		s.add(new StudentTreeSetDemo3("Einga", 50, 47.87));
		
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("--------------------------------------");
		
		Iterator<StudentTreeSetDemo3> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
