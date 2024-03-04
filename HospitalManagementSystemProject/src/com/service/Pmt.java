package com.service;

public interface Pmt {
	public void addminAddDoc();
	public void addminViewListDoc();
	public void addminUpdateDoc();
	public void addminDeleteDoc();
	
	public void addminAddNurse();
	public void addminViewListNurse();
	public void addminUpdateNurse();
	public void addminDeleteNurse();
	
	public void addminAddPatients();
	public void addminViewPatients();
	public void addminUpdatePatients();
	public void addminDeletePatients();

	public void receptionAddPatientAppointment();
	public void receptionViewPatientAppoinment();
	public void receptionUpdatePatientReceptionList();
	public void receptionDeletePatientReceptionList();
	
	
	public void doctorViewAppoinment();
	public void doctorCheckPatients();
	public void patientCheckedDetalis();
	public void doctorPatientsAddmit();
	public void patientCheckedAdmitDetails();

}
