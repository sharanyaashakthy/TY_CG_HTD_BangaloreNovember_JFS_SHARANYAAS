package com.capgemini.mywebapp.service;

import java.util.List;

import com.capgemini.mywebapp.bean.EmploeeInfoBean;
import com.capgemini.mywebapp.dao.EmployeeDAO;
import com.capgemini.mywebapp.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO dao = new EmployeeDAOImpl();
	

	@Override
	public EmploeeInfoBean serachEmployee(int empId) {
			return dao.searchEmployee(empId);
	}


	@Override
	public EmploeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}


	@Override
	public boolean addEmployee(EmploeeInfoBean enEmploeeInfoBean) {
		return dao.addEmployee(enEmploeeInfoBean);
	}


	@Override
	public boolean deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}


	@Override
	public List<EmploeeInfoBean> getAllEmployees() {
		return dao.getAllEmployees();
	}


	@Override
	public boolean updateEmployee(EmploeeInfoBean emploeeInfoBean) {
		return dao.updateEmployee(emploeeInfoBean);
	}

}
