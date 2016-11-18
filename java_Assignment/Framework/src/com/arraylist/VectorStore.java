package com.arraylist;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorStore {
	String firstName;
	String lastName;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to enter the first and last name");
		System.out.println("press 2 to show the capacity of the vector");
		int n=sc.nextInt();
		String first,last,comb;
		Vector<String> vec = new Vector<String>();
		while(true){
			switch(n){
			case 1: System.out.println("Enter the first name");
			first=sc.next();
			System.out.println("enter the last name");
			last=sc.next();
			vec.add(first+" "+last);
			break;
			case 2: Enumeration<String> e=vec.elements();
			while (e.hasMoreElements()) {         
				   System.out.println("Name = " + e.nextElement());
				   } 
				break;
			default : break;
			}
			System.out.println("press Y to continue and n to exit");
			String dec=sc.next();
			if(dec.equals("y")){
				System.out.println("press 1 to enter the first and last name");
				System.out.println("press 2 to show the capacity of the vector");
				n=sc.nextInt();
			}else
				break;
		}

	}

}
