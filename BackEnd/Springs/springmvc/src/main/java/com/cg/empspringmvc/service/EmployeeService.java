package com.cg.empspringmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.empspringmvc.bean.EmployeeBean;

@Service
public interface EmployeeService {
	public EmployeeBean auth(String email, String password);
	public boolean register(EmployeeBean bean);
	public List<EmployeeBean> getEmployees(String key);
	public boolean changePassword(int id, String password);

}
