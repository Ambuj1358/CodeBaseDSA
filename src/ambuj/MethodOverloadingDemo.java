package ambuj;

public class MethodOverloadingDemo {
	//final int a=10;
	
	public  MethodOverloadingDemo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//add method with two parameters
	public static int add(int a,int b) {
		return a+b;
	}
	
	//add method with three parameters
	public static int add(int a,int b,int c) {
		return a+ b+ c;
	}
	
	//add method with two parameter of diff types
	public static double add(double a,double b) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		final int a;
		a=10;
		System.out.println(a);
		System.out.println(a+10);
		//a=a+10;
		
		//add with two parameters of int type
		System.out.println(add(12, 20));
		
		//add with two parameters of double type
		System.out.println(add(10.0,12.0));
		
		//add with three parameters
		System.out.println(add(12,23,45));
		
	}

}
