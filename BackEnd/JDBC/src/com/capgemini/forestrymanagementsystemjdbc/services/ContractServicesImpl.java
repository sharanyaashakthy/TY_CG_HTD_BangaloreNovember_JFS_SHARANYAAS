package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.ContractDAO;
import com.capgemini.forestrymanagementsystemjdbc.dao.ContractDAOImpl;

public class ContractServicesImpl implements ContractServices {

	ContractDAO dao = new ContractDAOImpl();
	
	@Override
	public boolean addContract(ContractBean bean) {
		return dao.addContract(bean);
	}

	@Override
	public boolean deleteContract(int contractNumber) {
		return dao.deleteContract(contractNumber);
	}

}
