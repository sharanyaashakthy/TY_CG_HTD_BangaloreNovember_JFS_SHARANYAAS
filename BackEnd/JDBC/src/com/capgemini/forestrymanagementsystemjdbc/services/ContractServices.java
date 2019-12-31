package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractBean;

public interface ContractServices {
	boolean addContract(ContractBean bean);
	boolean deleteContract(int contractNumber);

}
