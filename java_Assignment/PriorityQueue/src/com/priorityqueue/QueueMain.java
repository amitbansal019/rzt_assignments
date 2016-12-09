package com.priorityqueue;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PriorityQueue[] abd = new PriorityQueue[10];
		String name;
		int number;
		System.out.println("enter the no of name you want to enter");
		int n=sc.nextInt();
	for(int i=0;i<n;i++){
		System.out.println("enter name and priority of the patient");
		name=sc.next();
		number=sc.nextInt();
		abd[i]=new PriorityQueue();
		abd[i].name=name;
		abd[i].priority=number;
		abd[i].add(abd);
	}

	}

}
