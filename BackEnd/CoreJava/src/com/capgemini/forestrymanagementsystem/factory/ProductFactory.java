package com.capgemini.forestrymanagementsystem.factory;

import com.capgemini.forestrymanagementsystem.dao.ProductDAO;
import com.capgemini.forestrymanagementsystem.dao.ProductDAOImpl;


public class ProductFactory {
	
	private ProductFactory(){
		
	}
	public static ProductDAO instanceOfProductDAOImpl()
	{
		ProductDAO dao = new ProductDAOImpl();
		return dao;
	}
	
	

}
