package jsp.cfl;

import java.util.*;

public class TreeSetDemo1 //All Wrapper classes and String Class implements Comparable(I) by default.
{
	public static void main(String[] args) 
	{
		/*NavigableSet<Integer> s = new TreeSet<Integer> ();
		s.add(20);
		s.add(65);
		s.add(62);
		s.add(59);
		s.add(278);
		s.add(43);
		s.add(67);
		
		System.out.println(s);//[20, 43, 59, 62, 65, 67, 278]*/
		
		/*NavigableSet<String> s= new TreeSet<String> ();
		s.add("Bangalore");
		s.add("Mangalore");
		s.add("Kumbakonam");
		s.add("Chennai");
		s.add("Daman Diu");
		s.add("Erode");
		System.out.println(s);//[Bangalore, Chennai, Daman Diu, Erode, Kumbakonam, Mangalore]*/
		
		NavigableSet<Double> s = new TreeSet<Double> ();
		s.add(34.67);
		s.add(45.67);
		s.add(34.89);
		s.add(28.67);
		s.add(39.99);
		System.out.println(s);//[28.67, 34.67, 34.89, 39.99, 45.67]
	}

}
