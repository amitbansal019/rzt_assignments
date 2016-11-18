package techm.itp.hyd10001.cs35123.Amit_GreeterTest;

import java.util.Scanner;

import techm.itp.hyd10001.cs35123.Amit.Advisor;
import techm.itp.hyd10001.cs35123.Amit.Greeter;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of person you want to invite");
		int n=sc.nextInt();
		String name;
	    Greeter[] g=new Greeter[10];
		for(int i=0;i<n;i++){
			System.out.println("enter the name");
			name=sc.next();
			g[i]=new Greeter(name);	
		}
		for(int i=0;i<n;i++){
			g[i].sayHello();
		}
		Advisor a=new Advisor();
		System.out.println("Advice : "+a.getAdvice());
		for(int i=n-1;i>-1;i--){
			g[i].sayHello();
		}
		

	}

}
