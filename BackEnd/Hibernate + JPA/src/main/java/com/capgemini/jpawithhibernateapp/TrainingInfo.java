package com.capgemini.jpawithhibernateapp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.onetoone.Emp_Personal_Info;

@Entity
@Table(name="TrainingInfo")
public class TrainingInfo {
	
	@Id
	@Column
	private int tid;
	@Column
	private String tname;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="training_employee", joinColumns = @JoinColumn(name="tid"), 
	inverseJoinColumns = @JoinColumn(name="epid"))
	private List<Emp_Personal_Info> elist;


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public List<Emp_Personal_Info> getElist() {
		return elist;
	}


	public void setElist(List<Emp_Personal_Info> elist) {
		this.elist = elist;
	}
	
	
	
	
}
