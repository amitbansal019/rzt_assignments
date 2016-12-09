package com.shop;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of products you want to enter");
		int n=sc.nextInt();
		String itemType,itemName,itemDescription,itemPrice;
		Tester t=new Tester();
		for(int i=0;i<n;i++){
			System.out.println("ente item type, name, description, price");
			itemType=sc.next();
			itemName=sc.next();
			itemDescription=sc.next();
			itemPrice=sc.next();
			t.add(itemType, itemName, itemDescription, itemPrice);	
		}
		t.totalPrice();
		System.out.println("enter the item which you want to search");
		String searchItem=sc.next();
		t.searchItem(searchItem);
		System.out.println("enter the item which you want to remove");
		String itemRemove=sc.next();
		t.removeItem(itemRemove);

	}

}
