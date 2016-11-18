package com.rectangle;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("lenth , breath and area without user entry");
		Rectangle a=new Rectangle();
		System.out.println("length = "+a.getLength());
		System.out.println("breath = "+a.getBreath());
		System.out.println("area = "+a.area());
		System.out.println("enter the length");
		int l=sc.nextInt();
		System.out.println("enter the breath");
		int b=sc.nextInt();
		Rectangle a1=new Rectangle(l,b);
		System.out.println("lenth , breath and area with user entry");
		System.out.println("length = "+a1.getLength());
		System.out.println("breath = "+a1.getBreath());
		System.out.println("area = "+a1.area());
		
		

	}

}
