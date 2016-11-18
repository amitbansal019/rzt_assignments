package com.date;

import java.util.Calendar;

public class Date {
	public void cdate(int day,int month,int year){
		if(month<12){
			if(month ==1 || month==3|| month==5 || 
					month==7 || month==8 || month==10|| month==12)
			{
				if(day==31){
					
				}else{
					System.out.println("invalid day entered");
				}
			}
			else if(month==2)
			{
				if(year%400==0 || year%4==0){
					if(day!=28)
						System.out.println("invalid day");
				}else if(year%100==0){
					if(day!=29)
						System.out.println("invalid day");
				}else if(day!=29)
					System.out.println("invalid day");
			}else if(day!=30)
				System.out.println("invalid day");
		}
		else
		{
			System.out.println("invalid month entered");
		}
			
		
		
	}
	public void dAdd(Employee e, int d, int m, int y) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();

		calendar.add(Calendar.DATE,d);

		calendar.add(Calendar.MONTH,m);

		calendar.add(Calendar.YEAR,y);
		
	}

}
