package com.cg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.springboot.dao.EmployeeDAO;
import com.cg.springboot.dto.EmployeeAddressBean;
import com.cg.springboot.dto.EmployeeBean;

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

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}


}
