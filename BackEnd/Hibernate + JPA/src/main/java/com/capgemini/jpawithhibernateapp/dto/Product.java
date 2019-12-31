package com.capgemini.jpawithhibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
//Data enables the automatic getters,setters,toString,...methods
@Data

@Entity
@Table(name="product_info")
public class Product {
	
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	
//	@Data does this
//	public int getPid() {
//		return pid;
//	}
//	public void setPid(int pid) {
//		this.pid = pid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	

}
