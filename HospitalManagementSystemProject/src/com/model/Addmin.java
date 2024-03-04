package com.model;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
@NamedQueries({
	@NamedQuery(name="getAlldata",query="from Addmin"),
	@NamedQuery(name="UpdateData",query="update Doctor set docName=? where docId=?"),
	@NamedQuery(name="deleteData",query="delete from Doctor where docId=?")
})
@Entity
public class Addmin {
	@Id
	private int admId;
	private long admAdharno;
	private String admName;
	private long admMobno;
	private String admAddr;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Doctor> dr=new HashSet<Doctor>();
	public int getAdmId() {
		return admId;
	}
	public void setAdmId(int admId) {
		this.admId = admId;
	}
	public long getAdmAdharno() {
		return admAdharno;
	}
	public void setAdmAdharno(long admAdharno) {
		this.admAdharno = admAdharno;
	}
	public String getAdmName() {
		return admName;
	}
	public void setAdmName(String admName) {
		this.admName = admName;
	}
	public long getAdmMobno() {
		return admMobno;
	}
	public void setAdmMobno(long admMobno) {
		this.admMobno = admMobno;
	}
	public String getAdmAddr() {
		return admAddr;
	}
	public void setAdmAddr(String admAddr) {
		this.admAddr = admAddr;
	}
	public Set<Doctor> getDr() {
		return dr;
	}
	public void setDr(Set<Doctor> dr) {
		this.dr = dr;
	}
	
}
