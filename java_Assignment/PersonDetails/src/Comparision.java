import java.time.LocalDate;
import java.util.Scanner;

abstract class Dates1{
	LocalDate dateOfBirth;
	void dateOfBirth(int age){
		dateOfBirth = LocalDate.now().minusYears(age);
	}
	abstract void equal(Person[] p,int n);
}
class Person extends Dates1{
	String name;
	Person(){}
	Person(String name,int age){
		this.name=name;
		dateOfBirth(age);	
	}
	@Override
	void equal(Person[] p,int n) {
		// TODO Auto-generated method stub
			if(p[0].name.equals(p[1].name)){
				if(p[0].dateOfBirth.equals(p[1].dateOfBirth)){
					System.out.println("both person are equal");
				}else{
					System.out.println("both are not equal");
				}
			}else{
				System.out.println("both are not equal");
			}
		
	}
	
}
public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of person detail you want to enter");
		int n=sc.nextInt();
		String name=null;
		int age = 0;
		Person[] p=new Person[n];
		for(int i=0;i<n;i++){
			System.out.println("enter name and age of the "+i+" person");
			name=sc.next();
			age=sc.nextInt();
			p[i]=new Person(name,age);	
		}
		System.out.println("checking person which are equal");
		Person p1=new Person();
		p1.equal(p,n);
		
		

	}

}
