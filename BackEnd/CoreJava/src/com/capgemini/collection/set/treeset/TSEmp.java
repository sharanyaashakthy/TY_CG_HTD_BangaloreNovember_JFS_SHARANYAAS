package com.capgemini.collection.set.treeset;

import java.util.TreeSet;

public class TSEmp {
	public static void main(String[] args) {
		
		//**************COMAPARTOR INTERFACE*******************
//		EmpName emp1 = new EmpName();
//		TreeSet<Emp> t2 =new TreeSet<Emp>(emp1);
		
//		EmpAge emp2 = new EmpAge();
//		TreeSet<Emp> t2 =new TreeSet<Emp>(emp2);
		
//		EmpSal emp3 = new EmpSal();
//		TreeSet<Emp> t3 =new TreeSet<Emp>(emp3);
		
		
		
		//**************COMAPARABLE INTERFACE*******************
		TreeSet<Emp> t1 =new TreeSet<Emp>();
		t1.add(new Emp("Binga", 22, 40000));
		t1.add(new Emp("Zinga", 29, 70000));
		t1.add(new Emp("Ainga", 21, 30000));
		t1.add(new Emp("Ringa", 25, 60000));
		
		for (Emp e1 : t1) {
			System.out.println("Name "+e1.name);
			System.out.println("Age "+e1.age);
			System.out.println("Salary "+e1.salary);
			System.out.println("------------------------------------");
		}
	}

}
//***********SORTING BASED ON AGE*********************
//Name Ainga
//Age 21
//Salary 30000
//------------------------------------
//Name Binga
//Age 22
//Salary 40000
//------------------------------------
//Name Ringa
//Age 25
//Salary 60000
//------------------------------------
//Name Zinga
//Age 29
//Salary 70000
//------------------------------------
//



//***********SORTING BASED ON SALARY*********************
//Name Ainga
//Age 21
//Salary 30000
//------------------------------------
//Name Binga
//Age 22
//Salary 40000
//------------------------------------
//Name Ringa
//Age 25
//Salary 60000
//------------------------------------
//Name Zinga
//Age 29
//Salary 70000
//------------------------------------

//******************SORTING BASED ON NAME IN ASCENDING ORDER*******************
//Name Ainga
//Age 21
//Salary 30000
//------------------------------------
//Name Binga
//Age 22
//Salary 40000
//------------------------------------
//Name Ringa
//Age 25
//Salary 60000
//------------------------------------
//Name Zinga
//Age 29
//Salary 70000
//------------------------------------
