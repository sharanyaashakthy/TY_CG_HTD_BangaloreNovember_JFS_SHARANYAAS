package jsp.cfl;

import java.util.*;
public class TreeSetDemo2 implements Comparator<Double> 
{
	public static void main(String[] args) 
	{
		/*NavigableSet<Integer> s = new TreeSet<Integer> (new TreeSetDemo2());
		s.add(20);
		s.add(65);
		s.add(62);
		s.add(59);
		s.add(278);
		s.add(43);
		s.add(67);
		
		System.out.println(s);//[278, 67, 65, 62, 59, 43, 20]

		//@override
		public int compare(Integer i1, Integer i2)
		{
			return i2.compareTo(i1);
		}*/
		
	/*	NavigableSet<String> s= new TreeSet<String> (new TreeSetDemo2());
		s.add("Bangalore");
		s.add("Mangalore");
		s.add("Kumbakonam");
		s.add("Chennai");
		s.add("Daman Diu");
		s.add("Erode");
		System.out.println(s);//[Mangalore, Kumbakonam, Erode, Daman Diu, Chennai, Bangalore]

	}
		//@override
				public int compare(String s1, String s2)
				{
					return s2.compareTo(s1);
				}
	*/
		NavigableSet<Double> s = new TreeSet<Double> (new TreeSetDemo2());
		s.add(34.67);
		s.add(45.67);
		s.add(34.89);
		s.add(28.67);
		s.add(39.99);
		System.out.println(s);//[45.67, 39.99, 34.89, 34.67, 28.67]

	}
	//@override
	public int compare(Double d1, Double d2)
	{
		return d2.compareTo(d1);
	}

}

