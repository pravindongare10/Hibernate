package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
		private long acno;
		private String acname;
		@OneToOne(cascade=CascadeType.ALL)
		private Address adr;
		public long getAcno() {
			return acno;
		}
		public void setAcno(long acno) {
			this.acno = acno;
		}
		public String getAcname() {
			return acname;
		}
		public void setAcname(String acname) {
			this.acname = acname;
		}
		public Address getAdr() {
			return adr;
		}
		public void setAdr(Address adr) {
			this.adr = adr;
		}
		
}
