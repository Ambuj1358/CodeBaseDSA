package basics;
// Multiple inheritance using interface
public class Alpha implements Hello, Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a=new Alpha();
	    a.doSomething();
	    a.display();
		

	}
	public void display() {
		System.out.println("Display something");
	}

	public void doSomething() {
		Hello.super.doSomething();
	}
	

	

}
