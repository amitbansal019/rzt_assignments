package com.printer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Printer {
	int maxSize;
	ArrayList<HashMap<String,Integer>> pages=
			new ArrayList<HashMap<String,Integer>>();
	int back;
	int front;
	int items;
	Printer(int n){
		pages=new ArrayList<HashMap<String,Integer>>();
		maxSize=n;
		back=-1;
		front=0;
		items=0;
	}
	void add(int no){
		Scanner sc=new Scanner(System.in);
		int check=front+no;
		if(check==maxSize || check>maxSize){
			System.out.println("maximum cpacity of printer is"+maxSize+" no more"
					+ " pages can be added");
			
		}else{
			for(int i=front;i<no;i++){
				HashMap<String,Integer> has=new HashMap<String,Integer>();
				System.out.println("enter page code");
				has.put("code",sc.nextInt());
				System.out.println("enter time it takes to print");
				has.put("time",sc.nextInt());
				pages.add(has);
				front++;
				
			}
			items=items+no;
			if(front>0 && back==-1){
				back++;
			}
			System.out.println("total no of pages in the printer "+items);	
		}
		
	}
	void remainingWork() {
		// TODO Auto-generated method stub
		System.out.println("total pages left to be printed "+items);
		
	}
	void removeBeginning(){
		pages.remove(back);
		items--;
		back++;
		System.out.println("beginning pointer is on "+back);
		System.out.println("total no of pages in printer "+items);
	}
	void removeLast(){
		pages.remove(front);
		items--;
		front--;
		System.out.println("end pointer is on "+front);
		System.out.println("total no of pages in printer "+items);
		
	}
	void removeById(int id){
		for(int i=0;i<pages.size();i++){
			if(pages.get(i).get("code")==id){
				pages.remove(i);
				items--;
			}
		}
		System.out.println("page with the code "+id +" is now removed");
		System.out.println("total no of pages left to be printed "+items);
	}
	void viewPage(){
		for(int i=0;i<pages.size();i++){
			System.out.println(pages.get(i).get("code")+"\t");
			System.out.println(pages.get(i).get("time")+"\n");
	
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the maximum capacity of printer");
		int n=sc.nextInt();
		Printer p=new Printer(n);
		int no;
		//p.remainingWork();
		System.out.println("press 1 to add pages");
		System.out.println("press 2 for total pages left to be printed ");
		System.out.println("press 3 to remove pages from end");
		System.out.println("press 4 to remove pages from front");
		System.out.println("press 5 to remove pages by page code");
		System.out.println("press 6 to see details of pages to be printed");
		int options=sc.nextInt();
		while(true){
			switch(options){
			case 1:
			System.out.println("enter no of pages you want to add");
			no=sc.nextInt();
			p.add(no);
			break;
			case 2: p.remainingWork();
			break;
			case 3: p.removeLast();
			break;
			case 4: p.removeBeginning();
			break;
			case 5: 
				System.out.println("enter page code which you want to delete");
				p.removeById(sc.nextInt());
				break;
			case 6:	p.viewPage();
			break;
			}
			System.out.println("press 1 to add pages");
			System.out.println("enter 2 to see no of pages");
			System.out.println("press 3 to remove pages from end");
			System.out.println("press 4 to remove pages from front");
			System.out.println("press 5 to remove pages by page code");
			System.out.println("press 6 to see details of pages to be printed");
			options=sc.nextInt();
				
			
		}
		
	}
	

}
