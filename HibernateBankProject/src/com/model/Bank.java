package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private Long micrcode;
	private String ifsccode;
	private String bname;

	public Long getMicrcode() {
		return micrcode;
	}
	public void setMicrcode(Long micrcode) {
		this.micrcode = micrcode;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
