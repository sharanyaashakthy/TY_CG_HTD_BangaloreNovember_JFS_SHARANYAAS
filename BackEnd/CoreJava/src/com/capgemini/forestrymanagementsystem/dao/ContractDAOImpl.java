package com.capgemini.forestrymanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystem.bean.ContractBean;

public class ContractDAOImpl implements ContractDAO {
	Scanner sc = new Scanner(System.in);
	

	List<ContractBean> contractBean = new ArrayList<ContractBean>();

	@Override
	public boolean addContract(ContractBean bean) {
		for (ContractBean contractBean2 : contractBean) {
			if(contractBean2.getContractNumber() == bean.getContractNumber())
			{
				return false;
			}
		}
		contractBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteContract(int contractNumber) {
		for (ContractBean contractBean3 : contractBean) {
			if(contractBean3.getContractNumber() == contractNumber)
			{
				contractBean.remove(contractBean3);
				return true;
			}
		}
		return false;
	}
	

}
