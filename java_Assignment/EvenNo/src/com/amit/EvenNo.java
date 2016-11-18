package com.amit;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int evenNo;
		for(int i=0;i<=no;i++){
			evenNo=i%2;
			if(evenNo==0)
				System.out.println(i);
			
		}

	}

}
