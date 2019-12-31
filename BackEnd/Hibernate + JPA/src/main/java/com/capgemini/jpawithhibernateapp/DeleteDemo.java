package com.capgemini.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernateapp.dto.MovieInfo;

public class DeleteDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			//fetch the data and the delete the records
			
			//1.fetching the data by using find()
			MovieInfo record = entityManager.find(MovieInfo.class, 2019004);
			//2.deleting the selected record by using remove()
			entityManager.remove(record);
			System.out.println("data removed successfully");
			//3.commit the changes in order to reflect on the table
			entityTransaction.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
	}

}
