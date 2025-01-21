package OOPBasics;

import org.w3c.dom.css.CSSRule;

public class Student {
	

	
	public static void main(String[] args) {
		
		//
		Student1 s1=new Student1();
		s1.name="Ambuj";
		s1.age=23;
		s1.roll=12345;
		s1.password="abcdef";
		s1.marks[0]=90;
		s1.marks[1]=95;
		s1.marks[2]=100;
		
		Student1 s2=new Student1(s1);	
		s1.marks[2]=99;
		
		System.out.println(s2.name + " " + s2.age + " " + s2.marks[0] + " "+s2.marks[1] + " " + s2.marks[2] );
		
	}

}

class Student1 {
	String name;
	int age;
	int roll;
	String password;
	int marks[];
	
	
	//copy constructor->shallow copy
	public Student1(Student1 s1) {
		marks=new int[3];
		this.name=s1.name;
		this.age=s1.age;
		this.roll=s1.roll;
		//this.marks=s1.marks;
		
		//deep copy
		for(int i=0;  i<marks.length;  i++) {
			this.marks[i]=s1.marks[i];
		}
	}
	
	//default constructor
	public Student1() {
		// TODO Auto-generated constructor stub
		marks=new int[3];
	}
	
	
	//parameterized constructor
	public Student1(String name) {
		this.name=name;
		marks=new int[3];
		//We can also remove public according to our use cases
		//System.out.println("Constructor called");
		
	}
	


	
	
	
}
