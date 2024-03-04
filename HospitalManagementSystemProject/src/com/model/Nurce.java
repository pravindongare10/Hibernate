package com.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Nurce {
	@Id
		private int nurceId;
		private String nurceName;
		private String nurceAddr;
		@ManyToOne
		private Addmin adm;
		public int getNurceId() {
			return nurceId;
		}
		public void setNurceId(int nurceId) {
			this.nurceId = nurceId;
		}
		public String getNurceName() {
			return nurceName;
		}
		public void setNurceName(String nurceName) {
			this.nurceName = nurceName;
		}
		public String getNurceAddr() {
			return nurceAddr;
		}
		public void setNurceAddr(String nurceAddr) {
			this.nurceAddr = nurceAddr;
		}
		public Addmin getAdm() {
			return adm;
		}
		public void setAdm(Addmin adm) {
			this.adm = adm;
		}
	
}
