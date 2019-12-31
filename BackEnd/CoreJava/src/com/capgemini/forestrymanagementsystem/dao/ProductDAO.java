package com.capgemini.forestrymanagementsystem.dao;

import com.capgemini.forestrymanagementsystem.bean.ProductBean;

public interface ProductDAO {
	public boolean addProduct(ProductBean bean);
	public boolean deleteProduct(int productId);
	public boolean modifyProduct(int productId);

}
