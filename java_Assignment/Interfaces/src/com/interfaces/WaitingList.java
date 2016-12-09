package com.interfaces;

import java.util.LinkedList;
import java.util.Queue;

public class WaitingList {
/*queue must be used as it follows first in first out*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> line=new LinkedList<String>();
		line.add("amit");
		line.add("rohan");
		line.add("sohan");
		line.add("raja");
		System.out.println("order of line");
		for(int i=0;i<4;i++){
			System.out.println(line.poll());
		}

	}

}
