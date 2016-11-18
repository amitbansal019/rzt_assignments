package com.date;

import java.util.Scanner;

public class Employee {
	int eNo;
	String eName;
	int eDay,eMonth,eYear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of employee you want to enter");
		int n=sc.nextInt();
		Employee[] x=new Employee[n];
		Date date=new Date();
		for(int i=0;i<n;i++){
			x[i]=new Employee();
			System.out.println("enter employee no, name, joining day, month and year");
			x[i].eNo=sc.nextInt();
			x[i].eName=sc.next();
			x[i].eDay=sc.nextInt();	
			x[i].eMonth=sc.nextInt();
			x[i].eYear=sc.nextInt();
			date.cdate(x[i].eDay,x[i].eMonth,x[i].eYear);
		}
		System.out.println("enter employee no you want to change");
		int n1=sc.nextInt();
		System.out.println("enter day,month and year");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		date.cdate(d,m,y);

	}

}
