package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;

public interface CustomerDAO {
	public List<CustomerBean> getAllCustomers();
	public boolean addCustomer(CustomerBean bean);
	public boolean deleteCustomer(int customerId);
	public CustomerBean getCustomer(int customerId);
	
	public boolean modifyCustomer(int customerId);
	

}
