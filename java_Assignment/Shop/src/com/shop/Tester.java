package com.shop;

import java.util.ArrayList;
import java.util.HashMap;

public class Tester {
	ArrayList<HashMap<String,String>> items=new ArrayList<HashMap<String,String>>();
	int clothesTotal,electronicsTotal,confectioneriesTotal,stationaryTotal,totalPrice;
	String raja;
	void add(String itemType,String itemName,String itemDescription,String itemPrice){
		HashMap<String,String> newProduct=new HashMap<String,String>();
		newProduct.put("itemType",itemType );
		newProduct.put("itemName", itemName);
		newProduct.put("itemDescription",itemDescription);
		newProduct.put("itemPrice",itemPrice);
		items.add(newProduct);	
	}
	void totalPrice(){
		clothesTotal=electronicsTotal=confectioneriesTotal=stationaryTotal=totalPrice=0;
		
		int size=items.size();
		for(int i=0;i<size;i++){
			String itemType=items.get(i).get("itemType");
			if(itemType.equals("clothes")){
				clothesTotal=clothesTotal+Integer.parseInt(items.get(i).get("itemPrice"));
				totalPrice=totalPrice+clothesTotal;
				
			}else if(itemType.equals("electronics")){
				electronicsTotal=electronicsTotal+Integer.parseInt(items.get(i).get("itemPrice"));
				totalPrice=totalPrice+electronicsTotal;
			}else if(itemType.equals("confectioneries")){
				confectioneriesTotal=confectioneriesTotal+Integer.parseInt(items.get(i).get("itemPrice"));
				totalPrice=totalPrice+confectioneriesTotal;
			}else{
				stationaryTotal=stationaryTotal+Integer.parseInt(items.get(i).get("itemPrice"));
				totalPrice=totalPrice+stationaryTotal;
			}
		}
		System.out.println("Clothes Total : "+clothesTotal);
		System.out.println("Electronics Total : "+electronicsTotal);
		System.out.println("Confectioneries Total : "+confectioneriesTotal);
		System.out.println("Stationary Total : "+stationaryTotal);
		System.out.println("Total : "+totalPrice);
		
	}
	void searchItem(String searchItem) {
		// TODO Auto-generated method stub
		//System.out.println("Items found for "+searchItem);
		//System.out.println("Name \t Description \t Price");
		int size=items.size();
		for(int i=0;i<size;i++){
			String itemType=items.get(i).get("itemType");
			if(itemType.equals(searchItem)){
				System.out.print(items.get(i).get("itemName")+"\t");
				System.out.print(items.get(i).get("itemDescription")+"\t");
				System.out.print(items.get(i).get("itemPrice"));
			}
			System.out.println();
			
		}
		
	}
   void removeItem(String itemRemove) {
		// TODO Auto-generated method stub
	   int size=items.size();
		for(int i=0;i<size;i++){
			String itemType=items.get(i).get("itemType");
			if(itemType.equals(itemRemove)){
				items.remove(i);
			}	
		}
		System.out.println("selected Item is removed");
		
	}
	

}
