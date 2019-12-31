package com.capgemini.forestrymanagementsystemjdbc.factory;

import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDAO;
import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDAOImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.ProductServices;
import com.capgemini.forestrymanagementsystemjdbc.services.ProductServicesImpl;


public class ProductFactory {
private ProductFactory(){
		
	}
	public static ProductDAO instanceOfProductDAOImpl()
	{
		ProductDAO dao = new ProductDAOImpl();
		return dao;
	}
	public static ProductServices instanceOfProductServices()
	{
		ProductServices services = new ProductServicesImpl();
		return services;
		
	}

}
