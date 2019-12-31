package com.capgemini.forestrymanagementsystemjdbc.dao;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractBean;

public interface ContractDAO {
	boolean addContract(ContractBean bean);
	boolean deleteContract(int contractNumber);
}
