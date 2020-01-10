package jsp.cfl;
import java.util.*;
public class ReverseObjects
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<String> ();
		l.add("Paris");
		l.add("India");
		l.add("Singapore");
		l.add("Salem");
		l.add("Bangalore");
		ListIterator<String> ltr = l.listIterator();
		while(ltr.hasNext())
		{
			ltr.next();
		}
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		
	}

}
