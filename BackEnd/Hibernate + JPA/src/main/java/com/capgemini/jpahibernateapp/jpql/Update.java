package com.capgemini.jpahibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		String jpql = "update MovieInfo set movieName='VTV' where movieid=2019004";
		Query query = entityManager.createQuery(jpql);
		int count = query.executeUpdate();
		if(count > 0) {
			System.out.println("Updated MovieName "+count);
			
		}
		
		entityTransaction.commit();
		entityManager.close();
	}

}
