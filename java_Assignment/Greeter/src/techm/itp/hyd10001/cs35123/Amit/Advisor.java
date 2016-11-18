package techm.itp.hyd10001.cs35123.Amit;

import java.util.Random;

public class Advisor{
	String[] message =new String[6];
	public Advisor(){
		message[1]="Nice to meet you";
		message[2]="Never say no";
		message[3]="Please to meet you";
		message[4]="Have a good day";
		message[5]="Good bye";
	}
	public String getAdvice(){
		Random r= new Random();
		return message[r.nextInt(5)];	
	}

}
