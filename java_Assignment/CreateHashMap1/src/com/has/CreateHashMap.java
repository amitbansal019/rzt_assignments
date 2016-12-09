package com.has;
import java.util.Scanner;

class HashMap<K,V>{
	K key;
	V value;
	public HashMap next;
	public HashMap(K key,V value){
		this.key=key;
		this.value=value;
		
	}
	void displayLink(){
		System.out.println("key :"+key+" value :"+value);
	}

}
class CreateHashMap1<V, K>{
	private HashMap first;
	private HashMap last;
	CreateHashMap1(){
		first=null;
		last=null;
	}
	boolean isEmpty(){
		return (first==null);
	}
	void put(int key,String value){
		HashMap newLink=new HashMap(key,value);
		if(isEmpty()){
			newLink.next=first;
			first=newLink;
			last=newLink;
		}	
		else
			last.next=newLink;
		    last=newLink;
		    newLink.next=null;
		
	}
	void keySet(){
		HashMap current=first;
		while(current.next!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
		System.out.print("key :"+current.key+" value :"+current.value+"\n");
	}
	void get(K key){
		HashMap current=first;
		V value = null;
		int flag=0;
		while(current.next!=null){
			if(current.key==key){
				value=(V) current.value;
				flag=1;
				break;
			}
			current=current.next;
		}
		if(flag==1){
			System.out.println("value for key "+key+" is "+value);
			flag=0;
		}
		else {
			if(current.key==key)
				flag=1;
		}
		if(flag==1)
			System.out.println("value for key "+key+"is "+current.value);
		else 
			System.out.println("not found");
		
		
	}
	HashMap remove(K key){
		HashMap current=first;
		HashMap previous=first;
		while(current.key!=key){
			if(current.next==null){
				return null;
				
			}else{
				previous=current;
				current=current.next;
			}
		}
		if(current==first)
			first=first.next;
		else
			previous.next=current.next;
		return current;
		

	}
	void size(){
		HashMap current=first;
		int counting=0;
		while(current.next!=null){
			counting++;
		}
	counting=counting+1;
		System.out.println("total values inserted are : "+counting);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		CreateHashMap1 c=new CreateHashMap1();
		System.out.println("enter 1 to put the values");
		System.out.println("enter 2 to find the values of key");
		System.out.println("enter 3 to remove");
		System.out.println("enter 4 to view");
		System.out.println("enter 5 to view size");
		int option=sc.nextInt();
		while(true){
			switch(option){
			case 1:
				System.out.println("enter no of values you want to put");
				int n=sc.nextInt();
				for(int i=0;i<n;i++){
					System.out.println("enter key and value");
					c.put(sc.nextInt(), sc.next());
				}
				break;
			case 2:
				System.out.println("enter the key to find");
				c.get(sc.nextInt());
				break;
			case 3:
				System.out.println("enter the key to remove");
				c.remove(sc.nextInt());
				break;
			case 4:
				c.keySet();
				break;
			case 5:
				c.size();
				break;
			}
			System.out.println("enter 1 to put the values");
			System.out.println("enter 2 to find the values of key");
			System.out.println("enter 3 to remove");
			System.out.println("enter 4 to view");
			System.out.println("enter 5 to view size");
			option=sc.nextInt();	
		}
		

	}

}

