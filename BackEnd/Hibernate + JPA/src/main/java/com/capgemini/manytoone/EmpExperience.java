package com.capgemini.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.onetoone.Emp_Personal_Info;

@Entity
@Table(name="EmpExperience")
public class EmpExperience {
	@Id
	@Column
	private int expId;
	@Column
	private String companyName;
	@Column
	private int noOfYear;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="epid")
	private Emp_Personal_Info epPersonal_Info;
	
	public int getExpId() {
		return expId;
	}
	public void setExpId(int expId) {
		this.expId = expId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getNoOfYear() {
		return noOfYear;
	}
	public void setNoOfYear(int noOfYear) {
		this.noOfYear = noOfYear;
	}
	
	
	
	

}
