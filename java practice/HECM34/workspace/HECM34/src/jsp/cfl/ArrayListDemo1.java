package jsp.cfl;

import java.util.*;

public class ArrayListDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList l= new ArrayList();
		ArrayList naya=new ArrayList();
		System.out.println("before: " +l.size());//before: 0
		l.add(21);
		l.add(54.43);
		l.add('A');
		l.add("India");
		l.add(null);
		l.add(100l);
		l.add(21);
		l.add(54.43);
		System.out.println(l);//[21, 54.43, A, India, null, 100, 21, 54.43]
		//remove(l.indexOf('A'));
		
		System.out.println(l.contains("India"));//true
		naya.add("hi");
		naya.add("hello");
		naya.add("bye");
		naya.add("see you");
		l.addAll(naya);//naya object is added to the l collection
		
		System.out.println(l);//[21, 54.43, A, India, null, 100, 21, 54.43, hi, hello, bye, see you]
		//set(2,'B');
		l.remove(11);
		l.remove(new Integer(21));
		System.out.println(l);
		l.retainAll(naya);
		System.out.println(l);//[hi, hello, bye]
		System.out.println(l.indexOf("see you"));//-1  this object is no more there in collection.so,returns -1
		System.out.println(l.get(1));//hello
		System.out.println(l.removeAll(naya));//true
		System.out.println(l);//[]

		l.retainAll(l);
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(!(o instanceof Integer) && !(o instanceof String))
			{
				l.remove(o);
				i--;
			}
		}
		System.out.print(l+" ");
	}

}





