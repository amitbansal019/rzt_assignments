package com.interfaces;

import java.util.HashSet;
import java.util.Set;

public class ProductName {
/*Set interface must be used as product names must be unique*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"amit", "kumar","kumar","raja","babu","raja","ram"};
	      Set<String> set = new HashSet<String>();
	         for(int i = 0; i < 6; i++) {
	            set.add(names[i]);
	         }
	         System.out.println(set);

	        

	

}
}
