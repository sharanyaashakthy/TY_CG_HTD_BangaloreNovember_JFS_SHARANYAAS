package com.capgemini.mywebapp.service;

import java.util.List;

import com.capgemini.mywebapp.bean.EmploeeInfoBean;

public interface EmployeeService {
	
	public EmploeeInfoBean serachEmployee(int empId) ;
	public EmploeeInfoBean authenticate(int empId, String password);
	public boolean addEmployee(EmploeeInfoBean enEmploeeInfoBean);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(EmploeeInfoBean emploeeInfoBean);
	public List<EmploeeInfoBean> getAllEmployees();
	

}
