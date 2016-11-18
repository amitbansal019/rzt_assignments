package com.calcaverage;

import java.util.Scanner;

public class Number {
	int a;
	int b;
	double result;
	Number(int a1,int b1){
		a=a1;
		b=b1;	
	}
	void add(){
		result=a+b;
		System.out.println(result);
	}
	void substract(){
		result=a-b;
		System.out.println(result);
	}
	void multiply(){
		result=a*b;
		System.out.println(result);
	}
	void divide(){
		if(b<1)
			throw new ArithmeticException("dividend cannot be zero or less than zero");
		else{
			result=a/b;
			System.out.println(result);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter the operation you want to do");
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		int c=sc.nextInt();
		Number num=new Number(a,b);
			switch(c){
			case 1: num.add();
			break;
			case 2: num.substract();
			break;
			case 3: num.multiply();
			break;
			case 4: num.divide();
			break;
			default: break;
			}
			

	}

}



































