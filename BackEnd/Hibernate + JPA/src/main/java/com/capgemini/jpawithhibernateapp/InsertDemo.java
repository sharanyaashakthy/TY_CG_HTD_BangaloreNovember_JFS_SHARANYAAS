package com.capgemini.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernateapp.dto.MovieInfo;

public class InsertDemo {
	public static void main(String[] args) {
		
		//create an object of the entity class 
		MovieInfo movieinfo = new MovieInfo();
		
		//set the values for the data members
		movieinfo.setMovieId(2019004);
		movieinfo.setMovieName("MNOP");
		movieinfo.setMovieRating("Best");
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			//pass the persistenceUnitName from persistence.xml file
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
		    entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			//pass the ref var of entity class(object entity)
			entityManager.persist(movieinfo);
			System.out.println("Data is inserted successfully");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
