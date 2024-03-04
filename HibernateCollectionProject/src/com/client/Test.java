package com.client;
import java.util.Scanner;
import com.serviceimpl.*;
public class Test {
	public static void main(String[] args) {
		
		Karvenager kk=new Karvenager();
		Scanner sc=new Scanner(System.in);
		do
		{	
			System.out.println("+++Choice is Yours:+++");
			System.out.println("1.AddCourse");
			System.out.println("2.Viewcourse");
			System.out.println("3.UpdateCoruse");
			System.out.println("4.DeleteCoruse");
			System.out.println("5.AddFaculty");
			System.out.println("6.ViewFaculty");
			System.out.println("7.UpdateFacuty");
			System.out.println("8.DeleteFacuty");
			System.out.println("9.AddBatch");
			System.out.println("10.ViewBatch");
			System.out.println("11.UpdateBatch");
			System.out.println("12.DeleBatch");
			System.out.println("13.AddStudent");
			System.out.println("14.ViewStudent");
			System.out.println("15.UpdateStudent");
			System.out.println("16.DeleteStudent");
			System.out.println("0.Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			kk.AddCourse();
			break; 
			case 2:
				kk.ViewCourse();
				break;
			case 3:
				kk.UpdateCourse();
				break;
			case 4:
				  kk.DeleteCourse();
				break;
			case 5:
				kk.AddFaculty();
				break;
			case 6:
				kk.ViewFaculty();
				break;
			case 7:
				kk.UpdateFaculty();
				break;

			case 8:
				kk.DeleteFaculty();
				break;
				
			case 9:
				kk.AddBatch();
				break;
			case 10:
				kk.ViewBatch();
			    break;
			case 11:
				kk.UpdateBatch();
				break;
			case 12:
				kk.DeleteBatch();
				break;
				
			case 13:
				kk.AddStudent();
				break;
			case 14:
				kk.ViewStudent();
				break;
			case 15:
				kk.UpdateStudent();
				break;
			case 16:
				kk.DeleteStudent();
				break;
			case 0:
				System.exit(0);
				
				
			default:
				System.out.println("That is not a valid option,Please choose again.");	
		}
		
		}while(true);
	}
}
