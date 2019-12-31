package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;

public interface ProductServices {
	public boolean addProduct(ProductBean bean);
	public boolean deleteProduct(int productId);
	public boolean modifyProduct(int productId);


}
