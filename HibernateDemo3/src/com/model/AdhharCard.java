package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdhharCard {
	@Id
	private long Addarno;
	private String name;
	private Long mobno;
	private String addr;
	public long getAddarno() {
		return Addarno;
	}
	public void setAddarno(long addarno) {
		Addarno = addarno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
