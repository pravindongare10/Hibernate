 package com.serviceimpl;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Addmin;
import com.model.Addmit;
import com.model.Doctor;
import com.model.Nurce;
import com.model.PatientCheckup;
import com.model.ReceptionPatientDetail;
import com.service.Pmt;
import com.utility.HibernateConnectivity;

public class PravaraHospital implements Pmt{
Scanner sc=new Scanner(System.in);
Session session=HibernateConnectivity.CreateSession();

@Override
public void addminAddDoc() {
	
	Transaction tx=session.beginTransaction();
	System.out.println("1. Add Admin And Doctor \n2. Add Only new Doctor");
	int ch = sc.nextInt();
	if(ch==1) {
	Addmin a=new Addmin();
	
	 System.out.println("admId");
	 int aid=sc.nextInt();
	 a.setAdmId(aid);
	 
	System.out.println("admAdharno");
	long aadhar=sc.nextLong();
	a.setAdmAdharno(aadhar);
	
	System.out.println("admName");
	String aname=sc.next();
	a.setAdmName(aname);
	
	System.out.println("admMobno");
	long amob=sc.nextLong();
	a.setAdmMobno(amob);
	
	System.out.println("admAddr");
	String ad=sc.next();
	a.setAdmAddr(ad);
	
	Doctor ddr=new Doctor();
	
	System.out.println("docId");
	int did=sc.nextInt();
	ddr.setDocId(did);
	
	System.out.println("docAdharno");
	long dadhar=sc.nextLong();
	ddr.setDocAdharno(dadhar);
	
	System.out.println("docName");
	String dname=sc.next();
	ddr.setDocName(dname);
	
	System.out.println("docMobno");
	long dmob=sc.nextLong();
	ddr.setDocMobno(dmob);
	
	System.out.println("daddr");
	String aaddr=sc.next();
	ddr.setDaddr(aaddr);
	
	a.getDr().add(ddr);
	
	session.save(a);
	tx.commit();
	}
	if(ch==2) {
		System.out.println("Enter Admin id");
		int aid = sc.nextInt();
	

		Addmin ad = session.get(Addmin.class, aid);
		if(ad!=null) {
			Doctor ddr=new Doctor();
			
			System.out.println("docId");
			int did=sc.nextInt();
			ddr.setDocId(did);
			
			System.out.println("docAdharno");
			long dadhar=sc.nextLong();
			ddr.setDocAdharno(dadhar);
			
			System.out.println("docName");
			String dname=sc.next();
			ddr.setDocName(dname);
			
			System.out.println("docMobno");
			long dmob=sc.nextLong();
			ddr.setDocMobno(dmob);
			
			System.out.println("daddr");
			String aaddr=sc.next();
			ddr.setDaddr(aaddr);
			
			ad.getDr().add(ddr);
			session.save(ad);
			tx.commit();
		}
	}
}
@Override
public void addminViewListDoc() {
	
	System.out.println("+++getAlldata+++");
	Query<Addmin>query=session.getNamedQuery("getAlldata");
	query.getResultList().forEach(s->{
		System.out.println("Admmin Details");
		System.out.println(s.getAdmId());
		System.out.println(s.getAdmAdharno());
		System.out.println(s.getAdmName());
		System.out.println(s.getAdmMobno());
		System.out.println(s.getAdmAddr());
		s.getDr().forEach(s1->{
			System.out.println("Doctor Detail");
			System.out.println(s1.getDocId());
			System.out.println(s1.getDocAdharno());
			System.out.println(s1.getDocName());
			System.out.println(s1.getDocMobno());
			System.out.println(s1.getDaddr());
		});

	});
	
}
@Override 
public void addminUpdateDoc() {
	System.out.println("Update Data");
	Query<Doctor>query=session.getNamedQuery("UpdateData");
	System.out.println("Enter Name:");
	String dnm=sc.next();
	query.setParameter(0, dnm);
	System.out.println("Enter Doctor docId:");
	int did=sc.nextInt();
	query.setParameter(1, did);
	Transaction tx=session.beginTransaction();
	query.executeUpdate();
	tx.commit();
}
@Override
public void addminDeleteDoc() {
	
	Transaction tx=session.beginTransaction();
	Query<Doctor>query=session.getNamedQuery("deleteData");
	System.out.println("Enter Doctor docId:");
	int did=sc.nextInt();
	query.setParameter(0,did);
	query.executeUpdate();
	tx.commit();
}
@Override
public void addminAddNurse() {
	Transaction tx=session.beginTransaction();

		System.out.println("Enter Admin id");
		int aid = sc.nextInt();
		Addmin ad = session.get(Addmin.class, aid);
		if(ad!=null) {
			Nurce nc=new Nurce();
			System.out.println("Enter nurceId");
			int nid=sc.nextInt();
			nc.setNurceId(nid);
			
			System.out.println("Enter nurceName");
			String nname=sc.next();
			nc.setNurceName(nname);
			
			System.out.println("Enter nurceAddr");
			String naddr=sc.next();
			nc.setNurceAddr(naddr);
			
			String hql="from Addmin";
			//create object of query
			Query<Addmin> query=session.createQuery(hql);
			List<Addmin> adm=query.getResultList();
			for (Addmin ad1 : adm) {
				nc.setAdm(ad1);
			}
			session.save(nc);
			tx.commit();
		}
	
	
}
@Override
public void addminViewListNurse() {
	
	String hql="from Nurce";
	//create object of query
	Query<Nurce> query=session.createQuery(hql);
	List<Nurce> ns=query.getResultList();
	for (Nurce n : ns) {
		System.out.println("Nurce Details");
		System.out.println(n.getNurceId());
		System.out.println(n.getNurceName());
		System.out.println(n.getNurceAddr());
		System.out.println("***Addmin Details***");
		System.out.println(n.getAdm().getAdmId());
		System.out.println(n.getAdm().getAdmAdharno());
		System.out.println(n.getAdm().getAdmName());
		System.out.println(n.getAdm().getAdmMobno());
		System.out.println(n.getAdm().getAdmAddr());
	}
	
}
@Override
public void addminUpdateNurse() {
	Transaction tx=session.beginTransaction();
	String hql="update Nurce set nurceName=? where nurceId=?";
	Query<Nurce>query3=session.createQuery(hql);
	query3.setParameter(0, "PD");
	query3.setParameter(1, 11);
	query3.executeUpdate();
	tx.commit();
	
}
@Override 
public void addminDeleteNurse() {
	Transaction tx=session.beginTransaction();
	String hql4="delete from Nurce where nurceId=?";
	Query<Nurce>query4=session.createQuery(hql4);
	System.out.println("Enter nid");
	int nid=sc.nextInt();
	query4.setParameter(0,nid);
	query4.executeUpdate();  
	tx.commit();
	
}
@Override
public void addminAddPatients() {
	System.out.println("Enter Addmin id");
	int id=sc.nextInt();
	Addmin aid=session.get(Addmin.class,id);
	if(aid!=null) {
	Transaction tx=session.beginTransaction();
	ReceptionPatientDetail rd=new ReceptionPatientDetail();
	System.out.println("Enter rpatientId			:");
	int rpid=sc.nextInt();
	rd.setPatientId(rpid);
	System.out.println("Enter rpatientName			:");
	String rpname=sc.next();
	rd.setPatientName(rpname);
	System.out.println("Enter Addmin id1 When Addmin Add PatientAppoimentDate  :");
	int id1=sc.nextInt();
	Addmin aid1=session.get(Addmin.class,id1);
	if(aid1!=null) {
	System.out.println("Add PatientAppoimentDate  :");
	Date d=new Date();
	rd.setPatientAppointmentdate(d);
	}
	System.out.println("Enter rpatientAddress       :");
	String ad=sc.next();
	rd.setPatientAddress(ad);
	System.out.println("Enter rpatientMobno         :");
	long mob=sc.nextLong();
	rd.setPatientMobno(mob);
	
	String hql="from Addmin";
	//create object of query
	Query<Addmin> query=session.createQuery(hql);
	List<Addmin> adm=query.getResultList();
	for (Addmin ad1 : adm) {
		rd.setAd(ad1);
	}
	String hql1="from Nurce";
	Query<Nurce> query1=session.createQuery(hql1);
	List<Nurce> nc=query1.getResultList();
	for (Nurce nc1 : nc) {
		rd.setNc(nc1);
	}
	session.save(rd);
	tx.commit();
	
	}
}
@Override
public void addminViewPatients() {
	System.out.println("Enter Addmin id");
	int id=sc.nextInt();
	Addmin did=session.get(Addmin.class,id);
	if(did!=null) {
		String hql="from ReceptionPatientDetail";
		Query<ReceptionPatientDetail>query=session.createQuery(hql);
		List<ReceptionPatientDetail>list=query.getResultList();
		for(ReceptionPatientDetail ps:list) {
			System.out.println("***Admmin View Patient Details***");
			System.out.println(ps.getPatientId());
			System.out.println(ps.getPatientName());
			System.out.println(ps.getPatientMobno());
			System.out.println(ps.getPatientAddress());
			System.out.println(ps.getPatientAppointmentdate());
			System.out.println("***Nurse Details***");
			System.out.println(ps.getNc().getNurceId());
			System.out.println(ps.getNc().getNurceName());
			System.out.println(ps.getNc().getNurceAddr());
		}
		
	}
	
}
@Override
public void addminUpdatePatients() {
	Transaction tx=session.beginTransaction();
	String hql="update ReceptionPatientDetail set patientName=? where patientId=?";
	Query<ReceptionPatientDetail>query3=session.createQuery(hql);
	query3.setParameter(0, "Sharukh");
	query3.setParameter(1, 1);
	query3.executeUpdate();
	tx.commit();
	
}
@Override
public void addminDeletePatients() {
	Transaction tx=session.beginTransaction();
	String hql4="delete from ReceptionPatientDetail where patientId=?";
	Query<ReceptionPatientDetail>query4=session.createQuery(hql4);
	System.out.println("Enter pid");
	int pid=sc.nextInt();
	query4.setParameter(0,pid);
	query4.executeUpdate();  
	tx.commit();
	
}


@Override
public void receptionAddPatientAppointment() {
	System.out.println("Enter Nurce id");
	int id=sc.nextInt();
	Nurce nid=session.get(Nurce.class,id);
	if(nid!=null) {
	Transaction tx=session.beginTransaction();
	ReceptionPatientDetail rd=new ReceptionPatientDetail();
	System.out.println("Enter rpatientId			:");
	int rpid=sc.nextInt();
	rd.setPatientId(rpid);
	System.out.println("Enter rpatientName			:");
	String rpname=sc.next();
	rd.setPatientName(rpname);
	System.out.println("Enter Nurce id1 When Nurce Add PatientAppoimentDate :");
	int id1=sc.nextInt();
	Nurce nid1=session.get(Nurce.class,id1);
	if(nid1!=null) {
	System.out.println("Add PatientAppoimentDate  :");
	Date d=new Date();
	rd.setPatientAppointmentdate(d);
	}
	System.out.println("Enter rpatientAddress       :");
	String ad=sc.next();
	rd.setPatientAddress(ad);
	System.out.println("Enter rpatientMobno         :");
	long mob=sc.nextLong();
	rd.setPatientMobno(mob);
	
	String hql="from Nurce";
	//create object of query
	Query<Nurce> query=session.createQuery(hql);
	List<Nurce> nc=query.getResultList();
	for (Nurce nc1 : nc) {
		rd.setNc(nc1);
	}
	String hql1="from Addmin";
	//create object of query
	Query<Addmin> query1=session.createQuery(hql1);
	List<Addmin> adm=query1.getResultList();
	for (Addmin ad1 : adm) {
		rd.setAd(ad1);
	}
	session.save(rd);
	tx.commit();
	
	}
	
}

@Override
public void receptionViewPatientAppoinment() {
	System.out.println("Enter Nurce id");
	int id=sc.nextInt();
	Nurce did=session.get(Nurce.class,id);
	if(did!=null) {
		String hql="from ReceptionPatientDetail";
		Query<ReceptionPatientDetail>query=session.createQuery(hql);
		List<ReceptionPatientDetail>list=query.getResultList();
		for(ReceptionPatientDetail ps:list) {
			System.out.println("*** ReceptionPatient View Patient Details***");
			System.out.println(ps.getPatientId());
			System.out.println(ps.getPatientName());
			System.out.println(ps.getPatientMobno());
			System.out.println(ps.getPatientAddress());
			System.out.println(ps.getPatientAppointmentdate());
			System.out.println("***Nurse Details***");
			System.out.println(ps.getNc().getNurceId());
			System.out.println(ps.getNc().getNurceName());
			System.out.println(ps.getNc().getNurceAddr());
		}
		
	}
	
}
@Override
public void receptionUpdatePatientReceptionList() {
	
	Transaction tx=session.beginTransaction();
	String hql="update ReceptionPatientDetail set patientName=? where patientId=?";
	Query<ReceptionPatientDetail>query3=session.createQuery(hql);
	query3.setParameter(0, "Rohit");
	query3.setParameter(1, 1);
	query3.executeUpdate();
	tx.commit();
}
@Override
public void receptionDeletePatientReceptionList() {
	Transaction tx=session.beginTransaction();
	String hql4="delete from ReceptionPatientDetail where patientId=?";
	Query<ReceptionPatientDetail>query4=session.createQuery(hql4);
	System.out.println("Enter pid");
	int pid=sc.nextInt();
	query4.setParameter(0,pid);
	query4.executeUpdate();  
	tx.commit();
	
}
@Override
public void doctorViewAppoinment() {
	System.out.println("Enter Doctor id");
	int id=sc.nextInt();
	Doctor did=session.get(Doctor.class,id);
	if(did!=null) {
		String hql="from ReceptionPatientDetail";
		Query<ReceptionPatientDetail>query=session.createQuery(hql);
		List<ReceptionPatientDetail>list=query.getResultList();
		for(ReceptionPatientDetail ps:list) {
			System.out.println("***Doctor View Patient Details***");
			System.out.println(ps.getPatientId());
			System.out.println(ps.getPatientName());
			System.out.println(ps.getPatientMobno());
			System.out.println(ps.getPatientAddress());
			System.out.println(ps.getPatientAppointmentdate());
			System.out.println("***Nurse Details***");
			System.out.println(ps.getNc().getNurceId());
			System.out.println(ps.getNc().getNurceName());
			System.out.println(ps.getNc().getNurceAddr());
		}
		
	}
	
}
@Override
public void doctorCheckPatients() {
	Transaction tx=session.beginTransaction();
	PatientCheckup p=new PatientCheckup();
	System.out.println("Enter patientid");
	int id=sc.nextInt();
	ReceptionPatientDetail pid=session.get(ReceptionPatientDetail.class, id);
	if(pid!=null) {
	System.out.println("Enter Priscription");
	String ps=sc.next();
	p.setPriscription(ps);
	System.out.println("Enter Chekupfee ");
	double f=sc.nextDouble();
	p.setChekupfee(f);
	System.out.println("Enter Patientstatus");
	String st=sc.next();
	p.setPatientstatus(st);
	
	String hql="from Doctor";
	//create object of query
	Query<Doctor> query=session.createQuery(hql);
	List<Doctor> doct=query.getResultList();
	for (Doctor doc : doct) {
		p.setDr(doc);
	}
	session.save(p);
	tx.commit();
}	
}
@Override
public void patientCheckedDetalis() {
	System.out.println("Enter patientid");
	int id=sc.nextInt();
	ReceptionPatientDetail pid=session.get(ReceptionPatientDetail.class, id);
	if(pid!=null) {
		String hql="from PatientCheckup";
		Query<PatientCheckup>query=session.createQuery(hql);
		List<PatientCheckup>list=query.getResultList();
		for(PatientCheckup ps:list) {
			System.out.println("***Checkupdetails***");
			System.out.println(ps.getPriscription());
			System.out.println(ps.getChekupfee());
			System.out.println(ps.getPatientstatus());
			System.out.println("***Doctor Details***");
			System.out.println(ps.getDr().getDocId());
			System.out.println(ps.getDr().getDocName());
			System.out.println(ps.getDr().getDocAdharno());
			System.out.println(ps.getDr().getDocMobno());
			System.out.println(ps.getDr().getDaddr());
		}
	}
	
}
@Override
public void doctorPatientsAddmit() {
	Transaction tx=session.beginTransaction();
	System.out.println("Enter patientid");
	int id=sc.nextInt();
	ReceptionPatientDetail pid=session.get(ReceptionPatientDetail.class, id);
	if(pid!=null) {
		Addmit a=new Addmit();
		System.out.println("Enter PatientBedId ");
		int bid=sc.nextInt();
		a.setPatientBedId(bid);
		
		System.out.println("Enter operationRupy");
		double Orupy=sc.nextDouble();
		a.setOperationRupy(Orupy);
		
		System.out.println("Enter perdaybedRupy ");
		double Perdayrupy=sc.nextDouble();
		a.setPerdaybedRupy(Perdayrupy);
		System.out.println("Enter totalbillAmmount");
		double Totalamount=sc.nextDouble();
		a.setTotalbillAmmount(Totalamount);
		String hql="from Doctor";
		//create object of query
		Query<Doctor> query=session.createQuery(hql);
		List<Doctor> doct=query.getResultList();
		for (Doctor doc : doct) {
			a.setDr(doc);
		}
		session.save(a);
		tx.commit();
		
	}
	
}
@Override
public void patientCheckedAdmitDetails() {
	System.out.println("Enter patientid");
	int id=sc.nextInt();
	ReceptionPatientDetail pid=session.get(ReceptionPatientDetail.class, id);
	if(pid!=null) {
		String hql="from Addmit";
		Query<Addmit>query=session.createQuery(hql);
		List<Addmit>list=query.getResultList();
		for(Addmit ad:list) {
			System.out.println("***Patient Details***");
			System.out.println(ad.getPatientBedId());
			System.out.println(ad.getOperationRupy());
			System.out.println(ad.getPerdaybedRupy());
			System.out.println(ad.getTotalbillAmmount());
			System.out.println("***Doctor Details***");
			System.out.println(ad.getDr().getDocId());
			System.out.println(ad.getDr().getDocName());
			System.out.println(ad.getDr().getDocAdharno());
			System.out.println(ad.getDr().getDocMobno());
			System.out.println(ad.getDr().getDaddr());
		}
	}
	
	
}

}