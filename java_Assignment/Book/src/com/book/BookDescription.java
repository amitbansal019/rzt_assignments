package com.book;

import java.util.Scanner;

public class BookDescription {
	int n;
	Book[] a;
	public void createBook(){
		String s,book_name;
		int book_price;
		System.out.println("enter the no of books you want to enter");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new Book[n];
		for(int i=0;i<n;i++){
			a[i]=new Book();
			System.out.println("enter the "+i+" of books name");
			book_name=sc.next();
			a[i].setBook_title(book_name);
			System.out.println("enter the "+i+" of books price");
			book_price=sc.nextInt();
			a[i].setBook_price(book_price);	
		}
		//System.out.println(a[0].getBook_price());
		
	}
	public void showBook(){
		System.out.println("Name \t Price");
		for(int i=0;i<n;i++){
			System.out.println(a[i].getBook_title()+"\t"+a[i].getBook_price());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDescription b1=new BookDescription();
		b1.createBook();
		b1.showBook();
		
		

	}


}

