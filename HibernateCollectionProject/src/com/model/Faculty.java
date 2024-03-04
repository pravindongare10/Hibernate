package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Faculty {
	   @Id
		private int fid;
		private String fname;
		@OneToOne(cascade=CascadeType.ALL)
		private Course c;
		public int getFid() {
			return fid;
		}
		public void setFid(int fid) {
			this.fid = fid;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public Course getC() {
			return c;
		}
		public void setC(Course c) {
			this.c = c;
		}
}
