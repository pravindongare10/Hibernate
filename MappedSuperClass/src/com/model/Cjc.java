package com.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public class Cjc {
	@Id
	private int sid;
	private String sname;
	private String coursename;
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
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

}
