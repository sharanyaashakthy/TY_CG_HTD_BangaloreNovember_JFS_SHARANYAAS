package jsp.cfl;

import java.util.*;

public class WorkingOfCursor
{
	public static void main(String[] args) 
	{	
		Set<Integer> s = new HashSet<Integer> ();
		s.add(43);
		s.add(10);
		s.add(20);
		s.add(75);
		s.add(30);
		s.add(89);
		s.add(40);
		s.add(60);
		s.add(45);
	
		Iterator<Integer> itr = s.iterator();
		//case 1:
		
		/*Iterator<Integer> i = s.iterator();
		while(itr.hasNext())
		{
			Integer i1= itr.next();
			itr.remove();
		}
		System.out.println(s);*/
		
		//case 2:
		
		/*Iterator<Integer> i2 = s.iterator();
		while(itr.hasNext())
		{
			itr.remove();
		}
		System.out.println(s);//Exception in thread "main" java.lang.IllegalStateException
							//	at java.util.HashMap$HashIterator.remove(Unknown Source)
							//	at jsp.cfl.WorkingOfCursor.main(WorkingOfCursor.java:35)*/
		//case 3:
		
		/*Iterator<Integer> i3 = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(itr.next());
		}//9 objects are there. it does not work for odd no.of objects 
		20
		40
		89
		10
		43
		75
		60
		45
		30
		Exception in thread "main" java.util.NoSuchElementException
			at java.util.HashMap$HashIterator.nextNode(Unknown Source)
			at java.util.HashMap$KeyIterator.next(Unknown Source)
			at jsp.cfl.WorkingOfCursor.main(WorkingOfCursor.java:47)*/
		
		//case 4:
		/*Iterator<Integer> i4 = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(itr.next());
			System.out.println(itr.next());
		}//works for 3 multiples
		20
		40
		89
		10
		43
		75
		60
		45
		30*/
		
		//case 5:
		Iterator<Integer> i4 = s.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			s.add(2);
			s.remove(2);
		}
		/*Exception in thread "main" java.util.ConcurrentModificationException
		at java.util.HashMap$HashIterator.nextNode(Unknown Source)
		at java.util.HashMap$KeyIterator.next(Unknown Source)
		at jsp.cfl.WorkingOfCursor.main(WorkingOfCursor.java:85)*/

		


		
		
		
		
	}

}
