package jsp.cfl;

import java.util.*;

public class IteratorSum 
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
		
		int sum=0;
		Iterator<Integer> itr = s.iterator();
		
		while(itr.hasNext())
		{
			Integer i = itr.next();
			if(i % 2 == 0)
			{
				sum = sum + i;
			}
			
		}
		
		System.out.println("Sum of even numbers = "+sum);

	}

}
