package com.capgemini.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernateapp.dto.MovieInfo;
/*
 * It doesn't get to the db
 * It gives the proxy name for the class
 * It throws EntityNotFoundException if data isn't present
 */
public class GetReferneceMethod {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		

		MovieInfo record = entityManager.getReference(MovieInfo.class, 2019001);
		System.out.println(record.getClass());
		System.out.println("MovieId = "+record.getMovieId());
		System.out.println("MovieName = "+record.getMovieName());
		System.out.println("MovieRating = "+record.getMovieRating());
		entityManager.close();
		
	}

}
