package com.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
		private int eid;
		private String name;
		@ManyToOne(cascade = CascadeType.ALL)
		private Department Dep;
		
		public Department getDep() {
			return Dep;
		}
		public void setDep(Department dep) {
			Dep = dep;
		}
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
