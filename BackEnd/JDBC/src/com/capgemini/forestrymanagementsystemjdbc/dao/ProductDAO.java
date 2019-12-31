package com.capgemini.forestrymanagementsystemjdbc.dao;

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;

public interface ProductDAO {
	public boolean addProduct(ProductBean bean);
	public boolean deleteProduct(int productId);
	public boolean modifyProduct(int productId);

}
