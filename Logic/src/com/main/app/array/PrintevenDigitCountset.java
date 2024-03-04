package com.main.app.array;

public class PrintevenDigitCountset {

	public static void main(String[] args) {
	
		int a[]= {789158,11591,186,121,1429,15012,12,197};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			int x=a[i];
			
			while(x!=0) {
				x=x/10;
				count ++;
			}
			if(count%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
