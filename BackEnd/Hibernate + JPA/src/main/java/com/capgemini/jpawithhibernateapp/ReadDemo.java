package com.capgemini.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernateapp.dto.MovieInfo;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		MovieInfo record = entityManager.find(MovieInfo.class, 2019001);
		System.out.println(record.getClass());
		System.out.println("MovieId = "+record.getMovieId());
		System.out.println("MovieName = "+record.getMovieName());
		System.out.println("MovieRating = "+record.getMovieRating());
		entityManager.close();
		
	}

}


//MovieId = 2019001
//MovieName = ABCD
//MovieRating = Good