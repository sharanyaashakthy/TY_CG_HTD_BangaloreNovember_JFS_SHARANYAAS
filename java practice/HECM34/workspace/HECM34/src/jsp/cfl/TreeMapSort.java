package jsp.cfl;

import java.util.*;
import java.util.Map.Entry;
//sorting key and value separately from tree map
public class TreeMapSort
{
		public static void main(String[] args) 
		{
			Map<Integer,String> m = new TreeMap<Integer, String>();
			m.put(10,"JSP");
			m.put(20,"QSP");
			m.put(30,"HI");
			m.put(40,"PHP");
			m.put(50,"JAVA");
			m.put(60,"J2EE");
			m.put(70,"SQL");
			m.put(80,"JSP");
			System.out.println(m);
			
			System.out.println("Key\tValue");
			System.out.println("----------------");
			
			Set<Entry<Integer,String>> s = m.entrySet();
			Iterator<Entry<Integer, String>> itr = s.iterator();
			while(itr.hasNext())
			{
				Entry<Integer, String> e = itr.next();
				System.out.println(e.getKey()+"\t\t"+e.getValue());
			}
			System.out.println();
			
			List<Integer> keys = new ArrayList<Integer> (m.keySet());
			List<String> values =  new ArrayList<String> (m.values());
			
			Collections.sort(keys);
			Collections.sort(values);
			
			System.out.println("Sorted key: "+keys);
			System.out.println("Sorted value: "+values);
			//Sorted key: [10, 20, 30, 40, 50, 60, 70, 80]
			//Sorted value: [HI, J2EE, JAVA, JSP, JSP, PHP, QSP, SQL]
			
		}

}
