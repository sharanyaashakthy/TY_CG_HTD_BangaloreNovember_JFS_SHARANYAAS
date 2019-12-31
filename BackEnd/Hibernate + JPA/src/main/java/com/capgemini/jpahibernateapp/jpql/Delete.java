package com.capgemini.jpahibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "delete from MovieInfo where movieId=2019004";
			Query query = entityManager.createQuery(jpql);
			int count = query.executeUpdate();
	    	if (count > 0) {
				
				System.out.println("Deleted successfully");
			}
	    	else {
	    		System.out.println("Unable to delete");
	    	}
	    	
			
	    
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
    	entityTransaction.commit();
    	entityManager.close();
	}

}
