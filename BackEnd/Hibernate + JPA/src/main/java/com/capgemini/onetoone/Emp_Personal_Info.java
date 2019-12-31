package com.capgemini.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="emp_personal_info")
public class Emp_Personal_Info {
	
	@Id
	@Column
	private int epid;
	
	@Column
	private String epname;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "epi")
	private Emp_Other_Info other;

	public int getEpid() {
		return epid;
	}

	public void setEpid(int epid) {
		this.epid = epid;
	}

	public String getEpname() {
		return epname;
	}

	public void setEpname(String epname) {
		this.epname = epname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Emp_Other_Info getOther() {
		return other;
	}

	public void setOther(Emp_Other_Info other) {
		this.other = other;
	}
	
	
	

}
