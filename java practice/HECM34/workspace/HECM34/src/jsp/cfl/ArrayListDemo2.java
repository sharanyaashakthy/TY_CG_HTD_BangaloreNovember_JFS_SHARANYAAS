package jsp.cfl;

import java.util.*;

public class ArrayListDemo2
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<String> ();
		l.add("Paris");
		l.add("India");
		l.add("Singapore");
		l.add("Salem");
		l.add("Bangalore");
		
		//Iterator itr = l.iterator();
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext())
		{
			String s = (String)ltr.next();
			if(s.startsWith("S"))
			{
				System.out.println(s);
			}
			
		}
		
		
	}

}
