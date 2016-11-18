package com.complex1;
class Complex{
	private double real;
	private double imaginary;
	Complex(){
		
	}
	Complex(double a,double b){
		real=a;
		imaginary=b;
	}
	Complex add(Complex r,Complex i){
		Complex Csum=new Complex();
		Csum.real=r.real+i.real;
		Csum.imaginary=r.imaginary+i.imaginary;
		return Csum;
		
	}
	Complex subtract(Complex r,Complex i){
		Complex Csubtract=new Complex();
		Csubtract.real=r.real-i.real;
		Csubtract.imaginary=r.imaginary-i.imaginary;
		return Csubtract;
		
	}
	void display(Complex c3){
		System.out.println(c3.real +"+i" + c3.imaginary);
	}
	
}

public class Complexmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(4,5);
		Complex c2=new Complex(1,3);
		Complex c3=new Complex();
		c3=c3.add(c1, c2);
		c3.display(c3);
		c3=c3.subtract(c1, c2);
		c3.display(c3);
		

	}

}
