package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.CustomerDAO;
import com.capgemini.forestrymanagementsystemjdbc.factory.CustomerFactory;

public class CustomerServicesImpl implements CustomerServices{
	
	CustomerDAO dao = CustomerFactory.instanceOfCustomerDAOImpl();

	@Override
	public List<CustomerBean> getAllCustomers() {
		return dao.getAllCustomers();
	}

	@Override
	public boolean addCustomer(CustomerBean bean) {
		return dao.addCustomer(bean);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		return dao.deleteCustomer(customerId);
	}

	public boolean modifyCustomer(CustomerBean customerBean) {
		return dao.modifyCustomer(customerBean);
	}

	@Override
	public CustomerBean getCustomer(int customerId) {
		return dao.getCustomer(customerId);
	}

	

}
