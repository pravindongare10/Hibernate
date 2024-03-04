package com.client;

import java.util.Scanner;

import com.serviceimpl.PravaraHospital;

public class Test {
	public static void main(String[] args) {
		PravaraHospital hosp=new PravaraHospital();
		Scanner sc=new Scanner(System.in);
			do
			{	
				System.out.println("+++Choice is Yours:+++");
				System.out.println("1.AddminAddDoctorData    :");
				System.out.println("2.AddminViewListDocData  :");
				System.out.println("3.AddminUpdateDocData    :");
				System.out.println("4.AddminDeleteDocData    :");
				System.out.println("5.AddminAddNurseData     :");
				System.out.println("6.AddminViewListNurseData:");
				System.out.println("7.AddminUpdateNurseData  :");
				System.out.println("8.AddminDeleteNurseData  :");
				System.out.println("9.AddminAddPatientsAppoiment  :");
				System.out.println("10.AddminViewPatients :");
				System.out.println("11.AddminUpdatePatients:");
				System.out.println("12.AddminDeletePatients:");
				System.out.println("13.ReceptionAddPatientAppointment:");
				System.out.println("14.ReceptionViewPatientAppoinment:");
				System.out.println("15.ReceptionUpdatePatientReceptionList:");
				System.out.println("16.ReceptionDeletePatientReceptionList :");
				System.out.println("17.DoctorView Patient Appoinment  :");
				System.out.println("18.DoctorCheckPatients :");
				System.out.println("19.PatientCheckedDetalis:");
				System.out.println("20.DoctorPatientsAddmit:");
				System.out.println("21.PatientCheckedAdmitDetails:");
				System.out.println("0.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				hosp.addminAddDoc();
				break; 
				case 2:
					hosp.addminViewListDoc();
					break;
				case 3:
					hosp.addminUpdateDoc();
					break;
				case 4:
					hosp.addminDeleteDoc();
					break;
				case 5:
					hosp.addminAddNurse();
					break;
				case 6:
					hosp.addminViewListNurse();
					break;
				case 7:
					hosp.addminUpdateNurse();
					break;

				case 8:
					hosp.addminDeleteNurse();
					break;
					
				case 9:
					hosp.addminAddPatients();
					break;
				case 10:
					hosp.addminViewPatients();
				    break;
				case 11:
					hosp.addminUpdatePatients();
					break;
				case 12:
					hosp.addminDeletePatients();
					break;
					
				case 13:
					hosp.receptionAddPatientAppointment();
					break;
				case 14:
					hosp.receptionViewPatientAppoinment();
					break;
				case 15:
					hosp.receptionUpdatePatientReceptionList();
					break;
				case 16:
					hosp.receptionDeletePatientReceptionList();
					break;
				case 17:
					hosp.doctorViewAppoinment();
					break;
				case 18:
					hosp.doctorCheckPatients();
					break;
				case 19:
					hosp.patientCheckedDetalis();
					break;
				case 20:
					hosp.doctorPatientsAddmit();
					break;
				case 21:
					hosp.patientCheckedAdmitDetails();
					break;
				case 0:
					System.exit(0);
					
					
				default:
					System.out.println("That is not a valid option,Please choose again.");	
			}
			
			}while(true);
		}

}
