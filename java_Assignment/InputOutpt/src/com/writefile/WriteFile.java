package com.writefile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	 public static void main(String args[]){ 
		 Scanner sc=new Scanner(System.in);
		 //System.out.println("enter the text which you want to enter");
			String s=new String();
			s=sc.nextLine();
		   try{  
		     FileOutputStream fout=new FileOutputStream("rzt.txt");  
		     //String s="Hello my name is amit ";  
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     fout.close();  
		     System.out.println("data written successfully...");  
		    }catch(Exception e){System.out.println(e);}  
		  } 

}
