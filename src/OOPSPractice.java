import java.util.Arrays;
import java.util.List;

import basics.override;

public class OOPSPractice {
	
	//statis method overloading and overriding demo
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b,int c) {
		return a + b+ c;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(add(1,2));
		
		System.out.println(add(2,3,4));
		Ambuj1358 amb=new Ambuj1358();
		int x=amb.add(3,4);
		System.out.println(x);
		
	}

}

class Ambuj1358 extends OOPSPractice {
	
	
	//Comparator<T>
	
	@override
	public static int add(int a,int b) {
		return a*b;
	}
	
	
}
