package com.calcaverage;

import java.util.Scanner;

public class CalcAverage {
	public double avgFirstN(int N){
		double sum=0;
		if(N<0){
			throw new IllegalArgumentException("the no cannot be less than 0");
		}
		else{
			for(int i=0;i<=N;i++){
				sum=sum+i;	
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		CalcAverage a=new CalcAverage();
		System.out.println(a.avgFirstN(n));

	}

}
