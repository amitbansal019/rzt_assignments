package com.testcompartment;

import java.util.Random;

abstract class Compartment{
	abstract void notice();	
}
class FirstClass extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("This is first class");
		
	}
	
}
class Ladies extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("this is Ladies compartment");
		
	}
	
}
class General extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("this is General compartment");
		
	}
	
}
class Luggage extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("this is Luggage compartment");
		
	}
	
}


public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] c=new Compartment[10];
		Random r= new Random();
		int m;
		for(int i=0;i<10;i++){
			m=r.nextInt(5);
			if(m==1){
				c[i]=new FirstClass();
				c[i].notice();
			}else if(m==2){
				c[i]=new Ladies();
				c[i].notice();
				
			}else if(m==3){
				c[i]=new General();
				c[i].notice();
				
			}else{
				c[i]=new Luggage();
				c[i].notice();
			}
				
		}

	}

}
