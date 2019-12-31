package com.capgemini.forestrymanagementsystem.dao;

import com.capgemini.forestrymanagementsystem.bean.ContractBean;

public interface ContractDAO {
		boolean addContract(ContractBean bean);
		boolean deleteContract(int contractNumber);
}
