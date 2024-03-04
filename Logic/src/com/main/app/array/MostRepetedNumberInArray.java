package com.main.app.array;

public class MostRepetedNumberInArray {

	public static void main(String[] args) {
		
		int a [] = {2,3,4,2,2,6,8,9,4,3,7,4,8,4,2,2};
		int maxCount=0;
		int repNum=0;
		for(int i = 0; i<a.length; i++) {
			int count=0;
			int num =0;
 			for(int j = i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					num=a[i];
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
				repNum= num;
			}
		}
		System.out.println("Most Repeated Number : "+repNum);
		System.out.println("Totat no of Occurance : "+(maxCount+1));
	}
	
}
