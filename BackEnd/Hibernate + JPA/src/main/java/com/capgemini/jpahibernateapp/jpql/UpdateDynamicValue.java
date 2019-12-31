package com.capgemini.jpahibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamicValue {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "update MovieInfo set movieName=:mn where movieId=:mid";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("mid", 2019003);
			query.setParameter("mn", "AYM");
			int result = query.executeUpdate();
			System.out.println("Dynamic query updated");
			System.out.println(result);
			entityTransaction.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
		
	}

}
