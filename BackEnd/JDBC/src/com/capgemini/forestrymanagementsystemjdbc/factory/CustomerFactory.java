package com.capgemini.forestrymanagementsystemjdbc.factory;

import com.capgemini.forestrymanagementsystemjdbc.dao.CustomerDAO;
import com.capgemini.forestrymanagementsystemjdbc.dao.CustomerDAOImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.CustomerServices;
import com.capgemini.forestrymanagementsystemjdbc.services.CustomerServicesImpl;


public class CustomerFactory {
	private CustomerFactory()
	{
		
	}
	public static CustomerDAO instanceOfCustomerDAOImpl()
	{
		CustomerDAO dao = new CustomerDAOImpl();
		return dao;
	}
	public static CustomerServices instanceOfCustomerServices()
	{
		CustomerServices services = new CustomerServicesImpl();
		return services;
	}



}
