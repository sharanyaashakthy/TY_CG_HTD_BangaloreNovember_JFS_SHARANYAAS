package jsp.cfl;
import java.util.*;
public class ReverseArrayList
{
	public static void main(String[] args) 
	{
		List l= new ArrayList();
		l.add(21);
		l.add(54.43);
		l.add('A');
		l.add(100);
		l.add("India");
		l.add("Paris");
		
		System.out.println("Before Reverse: "+l);
		
		//System.out.println("After Reverse: ");
		/*for(int i=0;i<l.size()/2;i++)
		{
			Object o=l.get(i);
			l.set(i, l.get(l.size()-1-i));
			l.set(l.size()-1-i,o);
			
		}*/
		
		Collections.reverse(l);//Collections is a class which has several utility methods and is present in java.util pkg
		System.out.println("After reverse: "+l);
		
		
		
		
		
	}

}
