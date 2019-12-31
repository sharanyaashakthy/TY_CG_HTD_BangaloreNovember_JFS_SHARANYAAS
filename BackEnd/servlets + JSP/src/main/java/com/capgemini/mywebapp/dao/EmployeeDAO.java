package com.capgemini.mywebapp.dao;

import java.util.List;

import com.capgemini.mywebapp.bean.EmploeeInfoBean;

public interface EmployeeDAO {
	
	
	public EmploeeInfoBean authenticate(int empId, String password);
	public  EmploeeInfoBean searchEmployee(int empId);
	
	public boolean addEmployee(EmploeeInfoBean enEmploeeInfoBean);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(EmploeeInfoBean emploeeInfoBean);
	public List<EmploeeInfoBean> getAllEmployees();
	
		
	

}
