package com.capgemini.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernateapp.dto.MovieInfo;

public class UpdateDemo {
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		EntityManagerFactory entityManagerFactory = null;
		
		try {
			entityManagerFactory =  Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			//find the details in order to update the values
			
			//1.find the details by passing rqd primary key
			MovieInfo record = entityManager.find(MovieInfo.class, 2019002);
			//2.set/update the details for the same primary key
			record.setMovieName("efgh");
			record.setMovieRating("average");
			System.out.println("Data is updated successfully");
			//The changes made will be reflected to table only if it commit() is performed
			entityTransaction.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
	}

}
