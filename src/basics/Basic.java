package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class A{
	String name;
	int age;
	public static void display() {
		System.out.println("Hi ambuj");
	}
}
class B extends A{
	String gender;
	public void eat() {
		System.out.println("Eat a mango");
	}
	
}
class C extends A{
	String color;
	String address;
	
	void details() {
		System.out.println("Hello ambuj");
	}
}
class D extends B {
	String country;
	String state;
	void show() {
		System.out.println("Hello People");
	}
}

public class Basic  {
	
	public static void main(String[] args) {
		String str="000012345";
		str=str.replaceFirst("^0+", "");
		System.out.println(str);
		
//		//single inheritance
//		B b=new B();
//		b.name="abhay";
//		b.age=45;
//		//b.color="blue";
//		System.out.println(b.name + b.age);
//		
//		//Multilevel inheritance
//		C c=new C();
//		c.name="ambuj";
//		//c.gender="male";
//		System.out.println(c.name);
	}

}
