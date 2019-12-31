package com.capgemini.forestrymanagementsystem.factory;

import com.capgemini.forestrymanagementsystem.dao.CustomerDAO;
import com.capgemini.forestrymanagementsystem.dao.CustomerDAOImpl;

public class CustomerFactory {
	private CustomerFactory()
	{
		
	}
	public static CustomerDAO instanceOfCustomerDAOImpl()
	{
		CustomerDAO dao = new CustomerDAOImpl();
		return dao;
	}

}
