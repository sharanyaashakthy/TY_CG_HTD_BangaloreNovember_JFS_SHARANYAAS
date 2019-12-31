package com.capgemini.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.capgemini.onetoone.Emp_Other_Info;
import com.capgemini.onetoone.Emp_Personal_Info;

public class OneToOneInsert {
public static void main(String[] args) {
		
		//create an object of the entity class 
		Emp_Personal_Info ePersonal_Info = new Emp_Personal_Info();
		
		//set the values for the data members
		ePersonal_Info.setEpid(2);
		ePersonal_Info.setEpname("Dinga");
		ePersonal_Info.setEmail("dinga@gmail.com");
		ePersonal_Info.setPassword("dinga");
		
		Emp_Other_Info eOther_Info = new Emp_Other_Info();
		eOther_Info.setEoid(22);
		eOther_Info.setFathername("DingaDad");
		eOther_Info.setMothername("DingaMom");
		eOther_Info.setPancard("dinga98765");
		eOther_Info.setEpi(ePersonal_Info);
		
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			//pass the persistenceUnitName from persistence.xml file
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
		    entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			//pass the ref var of entity class(object entity)
//			entityManager.persist(eOther_Info);
			
			Emp_Personal_Info emp =  entityManager.find(Emp_Personal_Info.class, 2);
			System.out.println(emp.getOther().getPancard());//dinga98765
			
			
			
		    
			System.out.println("Data is inserted successfully");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}


}
