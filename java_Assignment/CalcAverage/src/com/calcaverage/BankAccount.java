package com.calcaverage;

import java.util.Scanner;

public class BankAccount {
	int accNo;
	String custName,accType;
	float balance;
	BankAccount(int accno,String acctype,String custname,int bal){
		if(acctype.equals("saving")){
			if(bal<1000)
				throw new IllegalArgumentException("balance cannot be less"
						+ "than 1000 in saving account");
			else{
				balance=bal;
				accNo=accno;
				custName=custname;
				accType=acctype;
				
			}
				
			
		}else if(acctype.equals("current")){
			if(bal<5000)
				throw new IllegalArgumentException("balance cannot be less"
						+ " than 5000 in current account");
			else{
				balance=bal;
				accNo=accno;
				custName=custname;
				accType=acctype;
				
			}
			
		}
	}
	void deposit(float amt){
		if(amt<0)
			throw new IllegalArgumentException("the no cannot be less than 0");
		else{
			balance=balance+amt;
		}
		
	}
	void withdraw(float amt){
			if(amt<0)
				throw new IllegalArgumentException("the amount entered is 0");
			else{
				balance=balance-amt;
			}
		
	}
	void getBalance(){
		if(accType.equals("saving")){
			if(balance<1000)
				throw new IllegalArgumentException("low balance exception in saving");
			else{
				System.out.println(balance);
				
			}
				
			
		}else if(accType.equals("current")){
			if(balance<5000)
				throw new IllegalArgumentException("low balance exception in current");
			else{
				System.out.println(balance);	
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankAccount b=new BankAccount(1234,"current","amit",6000);
		System.out.println("enter the operation you want to do");
		System.out.println("enter 1 for deposit");
		System.out.println("enter 2 for withdrawl");
		System.out.println("enter 3 for viewing current balance");
		int c=sc.nextInt();
		switch(c){
		case 1: System.out.println("enter the amount to deposit");
		int am=sc.nextInt();
			if(b.accType.equals("saving")){
			if(b.balance<1000)
				throw new IllegalArgumentException("low balance exception in saving");
			else{
				System.out.println("you have "+b.accType+" account");
				b.deposit(am);
				b.getBalance();
				
			}
				
			
		}else if(b.accType.equals("current")){
			if(b.balance<5000)
				throw new IllegalArgumentException("low balance exception in current");
			else{
				System.out.println("you have "+b.accType+" account");
				b.deposit(am);
				b.getBalance();
			}
			
		}
			break;
			
		case 2: System.out.println("enter the amount to withdraw");
		int amw=sc.nextInt();
		b.withdraw(amw);
		b.getBalance();
		break;
		case 3: b.getBalance();
		break;
		
		}
		
		
	}


}












