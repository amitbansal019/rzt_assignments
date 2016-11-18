package com.search;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of enlements your want to enter");
		int n=sc.nextInt();
		int element;
		int[] a=new int[1000];
		int flag=0,flag1=0;
		System.out.println("enter the elements");
		for(int i=0;i<n;i++){
			element=sc.nextInt();
			a[element]=1;
		}
		System.out.println("enter the enement which you want to search");
		int m=sc.nextInt();
		if(a[m]==1)
			flag=1;
		int m1=sc.nextInt();
		if(a[m1]==1)
			flag1=1;
		if(flag==1 && flag1==1)
			System.out.println("Bingo");
		else 
			System.out.println("not found");

	}

}
