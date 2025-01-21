package basics;


//QUES 13 DONE
interface MyInterface{
	void myMethod();
	
	default void defaultMethod() {
		System.out.println("This is default method");
	}
}

class X implements MyInterface{

	@Override
	public void myMethod() {
		System.out.println("this is overridden method");
		
	}

	@override
	public  void defaultMethod() {
		System.out.println("This is overridden default method");
	}
	
	
}
public class DefaultMethod {

	public static void main(String[] args) {
		X bita=new X();
		bita.myMethod();
		bita.defaultMethod();

	}

}
