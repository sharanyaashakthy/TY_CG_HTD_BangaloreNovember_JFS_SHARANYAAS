package com.capgemini.mywebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.mywebapp.bean.EmploeeInfoBean;
import com.capgemini.mywebapp.dao.EmployeeDAO;
import com.sun.org.apache.bcel.internal.generic.ISUB;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employee");
	

	@Override
	public EmploeeInfoBean searchEmployee(int empId) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EmploeeInfoBean emploeeInfoBean = manager.find(EmploeeInfoBean.class, empId);
		manager.close();
		return emploeeInfoBean;
		
		

	}


	@Override
	public EmploeeInfoBean authenticate(int empId, String password) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmploeeInfoBean where empid=:empId and password=:password";
		Query query = manager.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("password", password);
		EmploeeInfoBean emploeeInfoBean = null;
		
		try {
			emploeeInfoBean = (EmploeeInfoBean)query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return emploeeInfoBean;
		
	}//end of authenticate()


	@Override
	public boolean addEmployee(EmploeeInfoBean enEmploeeInfoBean) {
		boolean isAdded = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = null;
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(enEmploeeInfoBean);
			transaction.commit();
			isAdded = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isAdded;
	}// end of addEmployee()


	@Override
	public boolean deleteEmployee(int empId) {
		boolean isDeleted = false;
		EntityManager manager = entityManagerFactory.createEntityManager();
		EmploeeInfoBean emploeeInfoBean = manager.find(EmploeeInfoBean.class, empId);
		EntityTransaction transaction = null;
		if(emploeeInfoBean != null) {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(emploeeInfoBean);
			transaction.commit();
			isDeleted = true;
		}
		manager.close();
		return isDeleted;
		
	}//end of deleteEmployee

	@Override
	public List<EmploeeInfoBean> getAllEmployees() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmploeeInfoBean";
		Query query = manager.createQuery(jpql);
		List<EmploeeInfoBean> employeeList = query.getResultList();
		manager.close();
		
		return employeeList;
	}//end of getAllEmployees


	@Override
	public boolean updateEmployee(EmploeeInfoBean emploeeInfoBean) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EmploeeInfoBean existingEmployeeBean = manager.find(EmploeeInfoBean.class, emploeeInfoBean.getEmpid());
		boolean isUpdated = false;
		EntityTransaction transaction = manager.getTransaction();
		
			if(existingEmployeeBean != null) {
				try {
					transaction.begin();
				
						String newName = emploeeInfoBean.getName().trim();
						if(newName != null && !newName.isEmpty()) {
							existingEmployeeBean.setName(newName);
						}
						
						int newAge = emploeeInfoBean.getAge();
						if(newAge > 18) {
							existingEmployeeBean.setAge(newAge);
						}
						
						String newDesignation = emploeeInfoBean.getDesignation().trim();
						if(newDesignation != null && !newDesignation.isEmpty()) {
							existingEmployeeBean.setDesignation(newDesignation);
						}
						
						double newSalary = emploeeInfoBean.getSalary();
						if(newSalary>0) {
							existingEmployeeBean.setSalary(newSalary);
						}
						
						String newPassword = emploeeInfoBean.getPassword().trim();
						if(newPassword != null && !newPassword.isEmpty()) {
							existingEmployeeBean.setPassword(newPassword);
						}
						
						transaction.commit();
						isUpdated = true;
				}	
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
			manager.close();
			return isUpdated;
	}

}//end of class
