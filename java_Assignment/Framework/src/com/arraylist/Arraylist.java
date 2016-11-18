package com.arraylist;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<String>();
		name.add("amit");
		name.add("raja");
		name.add("ravi");
		name.add("gopal");
		 for(String obj:name){
			 if(obj.equals("amit")){
				 System.out.println("found");
				 break;
			 }	 
			 else 
				 System.out.println("not found");
		 }  
			 }  

	

}
