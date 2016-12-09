package com.interfaces;

import java.util.HashMap;
import java.util.Map;

public class SameFirstName {
/*Map interface is best suited for this situation as we have to store
 * it is key value pair*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> names=new HashMap<String,String>();
		names.put("popular", "amit");
		names.put("average", "amit");
		names.put("medium","raja");
		names.put("small","babu");
		System.out.println(names.get("popular")+" is most popular");

	}

}
