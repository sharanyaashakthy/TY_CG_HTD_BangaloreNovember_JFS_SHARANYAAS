package com.cg.empspringboot1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cg.empspringboot1.dto.EmployeeBean;

public interface EmployeeRepository extends JpaRepository<EmployeeBean, Integer> {
	
	public EmployeeBean findByEmail(String email);
	
	@Query("from EmployeeBean where name=:key or email=:key")
	public List<EmployeeBean> findByKey(@Param("key") String key);
	
	@Transactional//update-->select stmt-->need of transaction
	@Modifying//modifying the db
	@Query("update EmployeeBean set password=:pwd where id=:id")
	public void changePassword(@Param("id")int id, @Param("pwd") String password);
	

}
