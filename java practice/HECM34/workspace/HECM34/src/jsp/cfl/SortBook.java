package jsp.cfl;

import java.util.*;

public class SortBook 
{
	public static void main(String[] args) 
	{
		NavigableSet<Book> s = new TreeSet<Book> ();
		s.add(new Book("Reddy", "Java",789.677));
		s.add(new Book("Reddy", "DS",678.99));
		s.add(new Book("John", "SQL",500.00));
		s.add(new Book("Henry", "Java",600.00));
		s.add(new Book("Reddy", "OS",500.85));
		
		
		
	}

}
