package com.cg.empspringboot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.empspringboot1.dto.EmployeeAddressBean;
import com.cg.empspringboot1.dto.EmployeeBean;
import com.cg.empspringboot1.exceptions.EmployeeException;
import com.cg.empspringboot1.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public EmployeeBean auth(String email, String password) {
	    EmployeeBean bean = repository.findByEmail(email);
	    
	    if(bean != null) {
	    	if(encoder.matches(password, bean.getPassword())) {
	    		return bean;
	    	}
	    	throw new EmployeeException("Password doesn't match");
	    }
	    throw new EmployeeException("Email doesn't exist");
	}

	@Override
	public boolean register(EmployeeBean bean) {
		bean.setPassword(encoder.encode(bean.getPassword()));
		for (EmployeeAddressBean addressBean : bean.getAddressBeans()) {
		}
		repository.save(bean);
		return true;
	}

	@Override
	public List<EmployeeBean> getEmployees(String key) {
		return repository.findByKey(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		repository.changePassword(id, encoder.encode(password));
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		repository.deleteById(id);
		return true;
	}

}
