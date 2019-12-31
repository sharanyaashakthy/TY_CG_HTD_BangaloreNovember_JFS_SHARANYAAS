package com.cg.empspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.empspringmvc.bean.EmployeeAddressBean;
import com.cg.empspringmvc.bean.EmployeeBean;
import com.cg.empspringmvc.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;// = new EmployeeDAOImpl()
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public EmployeeBean auth(String email, String password) {
		return dao.auth(email,password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
		
		//password encryption
		
		String encodePassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodePassword);
		
		List<EmployeeAddressBean> addressBeans = bean.getAddressBeans();
		for (EmployeeAddressBean employeeAddressBean : addressBeans) {
			employeeAddressBean.setBean(bean);
		}
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getEmployees(String key) {
		return dao.getEmployees(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

}
