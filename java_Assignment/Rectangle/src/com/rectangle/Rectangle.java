package com.rectangle;

public class Rectangle {
	private int length;
	private int breath;
	Rectangle(int l,int b){
		this.length=l;
		this.breath=b;
	}
	Rectangle(){
		System.out.println(this.length);
		System.out.println(this.breath);
		
	}
	public int getLength(){
		return this.length;
	}
	public int getBreath(){
		return this.breath;
	}
	public void setLength(int l){
		this.length=l;
	}
	public void setBreath(int b){
		this.breath=b;	
	}
	public int area(){
		return length*breath;	
	}

	

}