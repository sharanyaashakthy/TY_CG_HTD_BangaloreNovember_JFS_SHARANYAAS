package com.capgemini.forestrymanagementsystemjdbc.factory;

import com.capgemini.forestrymanagementsystemjdbc.dao.ContractDAO;
import com.capgemini.forestrymanagementsystemjdbc.dao.ContractDAOImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.ContractServices;
import com.capgemini.forestrymanagementsystemjdbc.services.ContractServicesImpl;

public class ContractFactory {
	private ContractFactory()
	{
		
	}
	public static ContractDAO instanceOfContractDAOImpl()
	{
		ContractDAO dao = new ContractDAOImpl();
		return dao;
	}
	
	public static ContractServices instanceOfContractServices()
	{
		ContractServices services = new ContractServicesImpl();
		return services;
	}

}
