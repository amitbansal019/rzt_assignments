package com.interfaces;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Employee {
/*List interface is best suited for this condition as employee name can be saved by */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> temp = 
				new ArrayList<String>(Arrays.asList("amit", "kumar","raja","babu"));
	Random r=new Random();
	
	System.out.println(temp.get(r.nextInt(4))+" is selected");

	}

}
