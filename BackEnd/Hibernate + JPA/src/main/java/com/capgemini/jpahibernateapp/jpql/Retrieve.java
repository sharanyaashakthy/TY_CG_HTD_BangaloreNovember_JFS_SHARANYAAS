package com.capgemini.jpahibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernateapp.dto.MovieInfo;

public class Retrieve {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		//String jpql = "from MovieInfo";
		String jpql = "select movieName from MovieInfo";
		Query query = entityManager.createQuery(jpql);
		List<String> record = query.getResultList();
		
		
//		for (MovieInfo movieInfo : record) {
//			System.out.println("MovieId "+movieInfo.getMovieId());
//			System.out.println("MovieName "+movieInfo.getMovieName());
//			System.out.println("MovieRating "+movieInfo.getMovieRating());
//			System.out.println("****************************************");
//			
//		}
		
		for (String movieInfo : record) {
			System.out.println(movieInfo);
		}
		entityManager.close();
		
		
	}

}


//Hibernate: select movieinfo0_.movieid as movieid1_0_, movieinfo0_.moviename as movienam2_0_, movieinfo0_.movierating as movierat3_0_ from movie_info movieinfo0_
//MovieId 2019001
//MovieName abcd
//MovieRating good
//****************************************
//MovieId 2019002
//MovieName efgh
//MovieRating average
//****************************************
//MovieId 2019003
//MovieName IJKL
//MovieRating Better
//****************************************
//MovieId 2019004
//MovieName zzzz
//MovieRating okay
//****************************************



//Hibernate: select movieinfo0_.moviename as col_0_0_ from movie_info movieinfo0_
//abcd
//efgh
//IJKL
//zzzz

