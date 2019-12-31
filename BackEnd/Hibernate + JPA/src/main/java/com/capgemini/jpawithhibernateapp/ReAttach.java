package com.capgemini.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernateapp.dto.MovieInfo;

public class ReAttach {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			MovieInfo record = entityManager.find(MovieInfo.class, 2019004);
			
			System.out.println(entityManager.contains(record));//true
			entityManager.detach(record);
			System.out.println(entityManager.contains(record));//false
			MovieInfo reattach = entityManager.merge(record);
			System.out.println(entityManager.contains(reattach));//true
			reattach.setMovieName("zzzz");
			reattach.setMovieRating("okay");
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	
	}

}
