package jsp.cfl;

import java.util.*;

public class StudAscDsc
{
	public static void main(String[] args)
	{
		NavigableSet<StudAscDscJB> s = new TreeSet<StudAscDscJB>(new StudAscDscJB());
		s.add(new StudAscDscJB("Dinga", 10, 87.87));
		s.add(new StudAscDscJB("Binga", 20, 67.87));
		s.add(new StudAscDscJB("Pinga", 30, 57.87));
		s.add(new StudAscDscJB("Singa", 40, 77.87));
		s.add(new StudAscDscJB("Sanga", 50, 47.87));
		System.out.println("Ascending order");
		Iterator<StudAscDscJB> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		System.out.println("Descending order");
		List<StudAscDscJB> l = new ArrayList<StudAscDscJB> ();
		Collections.reverse(l);
		itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
