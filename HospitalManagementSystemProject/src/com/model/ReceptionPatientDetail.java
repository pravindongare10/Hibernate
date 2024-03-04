package com.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ReceptionPatientDetail {
	@Id
	private int patientId; 
	private String patientName;
	private long patientMobno;
	private Date patientAppointmentdate;
	private String patientAddress;
	@ManyToOne
	private Addmin ad;
	@ManyToOne
	private Nurce nc;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPatientMobno() {
		return patientMobno;
	}
	public void setPatientMobno(long patientMobno) {
		this.patientMobno = patientMobno;
	}
	public Date getPatientAppointmentdate() {
		return patientAppointmentdate;
	}
	public void setPatientAppointmentdate(Date patientAppointmentdate) {
		this.patientAppointmentdate = patientAppointmentdate;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public Addmin getAd() {
		return ad;
	}
	public void setAd(Addmin ad) {
		this.ad = ad;
	}
	public Nurce getNc() {
		return nc;
	}
	public void setNc(Nurce nc) {
		this.nc = nc;
	}



}
