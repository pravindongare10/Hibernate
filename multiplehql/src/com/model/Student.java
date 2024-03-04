package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({
	@NamedQuery(name="getAlldata",query="from Student"),
	@NamedQuery(name="getsingledata",query="from Student where sid=?"),
	@NamedQuery(name="UpdateData",query="update Student set sname=? where sid=?")
})
@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
