package com.arraylist;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to add new phone book entry");
		System.out.println("press 2 to search phone no");
		int n=sc.nextInt();
		int phone;
		String name,name1;
		HashMap<String,Integer> phonebook=new HashMap<String,Integer>();
		while(true){
			switch(n){
			case 1: System.out.println("Enter the phone no");
			phone=sc.nextInt();
			System.out.println("enter the name");
			name=sc.next();
			phonebook.put(name,phone);
			break;
			case 2: System.out.println("enter name which you want to find");
			name1=sc.next();
			Integer fin1 = phonebook.get(name1);
			   if (fin1 != null) {
			     System.out.println("found :"+fin1);
			   }
			   else 
				   System.out.println("Not found");
				   
				break;
			default : break;
			}
			System.out.println("press Y to continue and n to exit");
			String dec=sc.next();
			if(dec.equals("y")){
				System.out.println("press 1 to add new phone book entry");
				System.out.println("press 2 to search phone no");
				n=sc.nextInt();
			}else
				break;
		}

	}

}
