package com.capgemini.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.onetoone.Emp_Personal_Info;

public class ManyToManyTrainingInfo {
	public static void main(String[] args) {
		
		Emp_Personal_Info info = new Emp_Personal_Info();
		info.setEpid(4);
		info.setEpname("Tinga");
		info.setEmail("tinga@gmail.com");
		info.setPassword("tinga");
		
		Emp_Personal_Info info1 = new Emp_Personal_Info();
		info1.setEpid(5);
		info1.setEpname("Pinga");
		info1.setEmail("pinga@gmail.com");
		info1.setPassword("pinga");
		
		ArrayList<Emp_Personal_Info> alist = new ArrayList<Emp_Personal_Info>();
		alist.add(info);
		alist.add(info1);
		
		TrainingInfo tinfo = new TrainingInfo();
		tinfo.setTid(401);
		tinfo.setTname("Java FS");
		tinfo.setElist(alist);

	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		//pass the persistenceUnitName from persistence.xml file
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		entityManager = entityManagerFactory.createEntityManager();
	    entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		//pass the ref var of entity class(object entity)
		entityManager.persist(tinfo);
		
		
		
		System.out.println("Data is inserted successfully");
		entityTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}

}
