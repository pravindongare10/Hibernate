 package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
		@Id
		private long accno;
		private String name;
		private long mobno;
		private long adharno;
		private String gender;
		private int age;
		private double balance=500;
		@ManyToOne(cascade=CascadeType.ALL)
		private Bank Central;
		public long getAccno() {
			return accno;
		}
		public void setAccno(long a) {
			this.accno = a;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getMobno() {
			return mobno;
		}
		public void setMobno(long mobno) {
			this.mobno = mobno;
		}
		public long getAdharno() {
			return adharno;
		}
		public void setAdharno(long adharno) {
			this.adharno = adharno;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Bank getCentral() {
			return Central;
		}
		public void setCentral(Bank central) {
			Central = central;
		}
		
	
}
