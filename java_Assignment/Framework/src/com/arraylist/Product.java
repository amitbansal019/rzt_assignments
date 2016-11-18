package com.arraylist;

import java.util.Hashtable;
import java.util.Scanner;

public class Product {
	String productId;
	String productName;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hashtable<String,String> product=new Hashtable<String,String>();
		System.out.println("enter the no of products you want to enter");
		int no=sc.nextInt();
		String productId,productName;
		for(int i=0;i<no;i++){
			System.out.println("enter the product id");
			productId=sc.next();
			productName=sc.next();
			product.put(productId, productName);
		}
		System.out.println(product);
		System.out.println("enter the procut which you want to find");
		String fin=sc.next();
		 String fin1 = product.get(fin);
		   if (fin1 != null) {
		     System.out.println("found :"+fin1);
		   }else{
			   System.out.println("not found");
		   }
		System.out.println("enter the produt which you want to delete");
		productId=sc.next();
		product.remove(productId);
		System.out.println(product);
		
	}

}
