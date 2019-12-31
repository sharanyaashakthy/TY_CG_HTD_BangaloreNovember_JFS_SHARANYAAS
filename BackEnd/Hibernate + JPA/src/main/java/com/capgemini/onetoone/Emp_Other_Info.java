package com.capgemini.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="emp_other_info")
public class Emp_Other_Info {
	
	@Id
	@Column
	private int eoid;
	
	@Column
	private String fathername;
	
	@Column
	private String mothername;
	
	@Column
	private String pancard;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="epid")
	private Emp_Personal_Info epi;

	public int getEoid() {
		return eoid;
	}

	public void setEoid(int eoid) {
		this.eoid = eoid;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public Emp_Personal_Info getEpi() {
		return epi;
	}

	public void setEpi(Emp_Personal_Info epi) {
		this.epi = epi;
	}
	
	

}
