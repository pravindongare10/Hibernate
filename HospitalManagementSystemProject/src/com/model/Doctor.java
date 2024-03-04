package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	private int docId;
	private long docAdharno;
	private String docName;
	private long docMobno;
	private String daddr;
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public long getDocAdharno() {
		return docAdharno;
	}
	public void setDocAdharno(long docAdharno) {
		this.docAdharno = docAdharno;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public long getDocMobno() {
		return docMobno;
	}
	public void setDocMobno(long docMobno) {
		this.docMobno = docMobno;
	}
	public String getDaddr() {
		return daddr;
	}
	public void setDaddr(String daddr) {
		this.daddr = daddr;
	}
	
}
