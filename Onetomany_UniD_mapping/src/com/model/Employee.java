package com.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
		private int eid;
		private String name;
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
