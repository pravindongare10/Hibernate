package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	@OneToOne(cascade=CascadeType.ALL)
	private AdharCard ad;
	
	public AdharCard getAd() {
		return ad;
	}
	public void setAd(AdharCard ad) {
		this.ad = ad;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
}
