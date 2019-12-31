package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDAO;
import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDAOImpl;

public class ProductServicesImpl implements ProductServices {

	ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean deleteProduct(int productId) {
		return dao.deleteProduct(productId);
	}

	@Override
	public boolean modifyProduct(int productId) {
		return dao.modifyProduct(productId);
	}

}
