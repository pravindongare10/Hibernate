package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class PatientCheckup {
	@Id
	private String priscription;
	private double Chekupfee;
	private String patientstatus;
	@OneToOne
	private Doctor dr;
	public String getPriscription() {
		return priscription;
	}
	public void setPriscription(String priscription) {
		this.priscription = priscription;
	}
	public double getChekupfee() {
		return Chekupfee;
	}
	public void setChekupfee(double chekupfee) {
		Chekupfee = chekupfee;
	}
	public String getPatientstatus() {
		return patientstatus;
	}
	public void setPatientstatus(String patientstatus) {
		this.patientstatus = patientstatus;
	}
	public Doctor getDr() {
		return dr;
	}
	public void setDr(Doctor dr) {
		this.dr = dr;
	}


	
}
 