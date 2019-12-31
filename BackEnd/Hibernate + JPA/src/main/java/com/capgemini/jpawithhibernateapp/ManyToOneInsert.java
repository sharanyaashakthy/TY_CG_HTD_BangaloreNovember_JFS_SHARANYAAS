package com.capgemini.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.manytoone.EmpExperience;
import com.capgemini.onetoone.Emp_Personal_Info;

public class ManyToOneInsert {
	public static void main(String[] args) {
		
		Emp_Personal_Info epi = new Emp_Personal_Info();
		epi.setEpname("Binga");
		epi.setEmail("binga@gmail.com");
		epi.setPassword("binga");
		
		EmpExperience exp = new EmpExperience();
		epi.setEpid(3);
		exp.setExpId(301);
		exp.setCompanyName("IBM");
		exp.setNoOfYear(4);
		
		EmpExperience exp1 = new EmpExperience();
	
		exp1.setExpId(302);
		exp1.setCompanyName("TCS");
		exp1.setNoOfYear(2);
		
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			//pass the persistenceUnitName from persistence.xml file
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
		    entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			//pass the ref var of entity class(object entity)
			entityManager.persist(exp);
			entityManager.persist(exp1);
			
			
			System.out.println("Data is inserted successfully");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
