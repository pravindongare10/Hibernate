package com.client;

import java.util.Scanner;

import com.serviceimpl.Sbi;
public class Test {
	public static void main(String[] args) {
		Sbi bnk=new Sbi();
		Scanner sc=new Scanner(System.in);
		do
		{	
			System.out.println("+++Choice is Yours:+++");
			System.out.println("1.createAccount");
			System.out.println("2.");
			System.out.println("3.");
			System.out.println("4.");
			System.out.println("5.");
			System.out.println("6.");
			System.out.println("0.Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			bnk.createAccount();
			break; 
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				  
				break;
			case 5:
				
				break;
			case 6:
				break;
			case 0:
				System.exit(0);
				
				
			default:
				System.out.println("That is not a valid option,Please choose again.");	
		}
		
		}while(true);
	}
}
