package com.capgemini.contactsimulator.dto;

import java.io.Serializable;

public class ContactBean implements Serializable{
	private String name;
	private long number;
	private String category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", category=" + category + "]";
	}
	
	

}
