package com.capgemini.forestrymanagementsystem.factory;

import com.capgemini.forestrymanagementsystem.dao.ContractDAO;
import com.capgemini.forestrymanagementsystem.dao.ContractDAOImpl;

public class ContractFactory {
	private ContractFactory()
	{
		
	}
	public static ContractDAO instanceOfContractDAOImpl()
	{
		ContractDAO dao = new ContractDAOImpl();
		return dao;
	}

}
