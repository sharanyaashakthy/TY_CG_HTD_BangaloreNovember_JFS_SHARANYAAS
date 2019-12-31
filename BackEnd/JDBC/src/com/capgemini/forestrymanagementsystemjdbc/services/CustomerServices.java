package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;

public interface CustomerServices {
	public List<CustomerBean> getAllCustomers();
	public boolean addCustomer(CustomerBean bean);
	public boolean deleteCustomer(int customerId);
	public boolean modifyCustomer(int customerID);
	public CustomerBean getCustomer(int customerId);


}
