package techm.itp.hyd10001.cs35123.Amit;

public class Greeter {
	String Name;
	public Greeter(String aName){
		Name=aName;
	}
	public void sayHello(){
		System.out.println("Hello "+Name+"!");
	}
	public void sayGoodBye(){
		System.out.println("Goodbye "+Name+"!");
	}

}
