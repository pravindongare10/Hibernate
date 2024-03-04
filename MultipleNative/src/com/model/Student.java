package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
	@NamedNativeQuery(name="insertdata",query="insert into Student Values(?,?)",resultClass=Student.class),
	@NamedNativeQuery(name="getAlldata",query="select * from Student",resultClass=Student.class),
	@NamedNativeQuery(name="Singledata",query="select * from Student where sid= ?",resultClass=Student.class)
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
