package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AdharCard {
	@Id
	private long adharno;
	private String adharname;
	@OneToOne(cascade=CascadeType.ALL)
	private Person ps;
	public Person getPs() {
		return ps;
	}
	public void setPs(Person ps) {
		this.ps = ps;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getAdharname() {
		return adharname;
	}
	public void setAdharname(String adharname) {
		this.adharname = adharname;
	}
	

}
