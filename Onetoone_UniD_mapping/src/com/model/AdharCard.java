 package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AdharCard {
	@Id
	private long adharno;
	private String adharname;
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
