/*Key		value
---------------------------------
80		JSP
50		JAVA
20		QSP
70		SQL
40		PHP
10		JSP
60		J2EE
30		HI
*/

package jsp.cfl;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo1
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m = new HashMap<Integer, String>();
		m.put(10,"JSP");
		m.put(20,"QSP");
		m.put(30,"HI");
		m.put(40,"PHP");
		m.put(50,"JAVA");
		m.put(60,"J2EE");
		m.put(70,"SQL");
		m.put(80,"JSP");
		System.out.println(m);
		System.out.println(m.put(70, "JAVA"));
		System.out.println(m);
		System.out.println(m.get(40));
		System.out.println(m.containsKey(80));
		System.out.println(m.containsValue("India"));
		m.remove(40);
		System.out.println(m);
		Set<Integer> keys = m.keySet();
		System.out.println("Key :"+keys);
		Collection<String> values = m.values();
		System.out.println("Value :"+values);
		//Set entries = m.entrySet();//use entry specific method
		
		System.out.println("Key\t\tvalue");
		System.out.println("---------------------------------");
		
		Set<Entry<Integer,String>> s = m.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		System.out.println();
		
		System.out.println("Before:"+m);//Before:{80=JSP, 50=JAVA, 20=QSP, 70=JAVA, 10=JSP, 60=J2EE, 30=HI}
		Iterator<Entry<Integer, String>> itr1 = m.entrySet().iterator();
		while(itr1.hasNext())
		{
			Entry<Integer, String> e = itr1.next();
			if(e.getValue().equalsIgnoreCase("Jsp"))
			{
				e.setValue("QSP");
			}
		}
		System.out.println("After :" +m);//After :{80=QSP, 50=JAVA, 20=QSP, 70=JAVA, 10=QSP, 60=J2EE, 30=HI}
		
		
	}

}
