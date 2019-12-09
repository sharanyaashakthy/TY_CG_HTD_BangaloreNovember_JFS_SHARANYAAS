package com.capgemini.collection.list.vector;

import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.addElement(24);
		v1.addElement(56);
		v1.addElement(78);
		v1.add(67);
		System.out.println(v1);//[24, 56, 78, 67]
		v1.removeElement(new Integer(24));
		System.out.println(v1);//[56, 78, 67]
		v1.removeElementAt(2);//[56, 78]
		System.out.println(v1);
		
		Object[] i1 = new Object[v1.size()];
		v1.copyInto(i1);//converts object[] into array
		for(int i=0; i<i1.length;i++)
		{
			System.out.println(i1[i]);
		}
		
//		56
//		78
		
		v1.removeAllElements();
		System.out.println(v1);//[]
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.addElement(34);
		v2.addElement(56);
		
		System.out.println(v2.size());//2
		System.out.println(v2.capacity());//10
		v2.trimToSize();
		System.out.println(v2.size());//2
		System.out.println(v2.capacity());//2
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println(v2.size());//8
		System.out.println(v2.capacity());//12 //As the size is greater than the ensured capacity, it automatically doubles the capacity to 12
		System.out.println(v2);//[34, 56, null, null, null, null, null, null]
		

		
	}

}
