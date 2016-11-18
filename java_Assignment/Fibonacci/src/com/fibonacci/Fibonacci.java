package com.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum;
		System.out.println(a+"\n"+b);
		for(int i=0;i<13;i++){
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}

	}

}
