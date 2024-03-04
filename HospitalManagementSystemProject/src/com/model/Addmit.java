package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Addmit {
	@Id
		private int patientBedId;
		private double operationRupy;
		private double perdaybedRupy;
		private double totalbillAmmount;	
		@OneToOne
		private Doctor dr;
		public int getPatientBedId() {
			return patientBedId;
		}
		public void setPatientBedId(int patientBedId) {
			this.patientBedId = patientBedId;
		}
		public double getOperationRupy() {
			return operationRupy;
		}
		public void setOperationRupy(double operationRupy) {
			this.operationRupy = operationRupy;
		}
		public double getPerdaybedRupy() {
			return perdaybedRupy;
		}
		public void setPerdaybedRupy(double perdaybedRupy) {
			this.perdaybedRupy = perdaybedRupy;
		}
		public double getTotalbillAmmount() {
			return totalbillAmmount;
		}
		public void setTotalbillAmmount(double totalbillAmmount) {
			this.totalbillAmmount = totalbillAmmount;
		}
		public Doctor getDr() {
			return dr;
		}
		public void setDr(Doctor dr) {
			this.dr = dr;
		}


		
}
