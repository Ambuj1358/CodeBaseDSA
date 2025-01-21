package demo;
import java.util.*;

class Student1{
	private String name;
	private int age;
	private int marks;
	
	//Default constructor for student
	Student1(){}
	
	Student1(String name, int age, int marks){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "Student [ name = " + name + " ,age = " + age+ " ,marks = " + marks + "]";
	}
	
	
}
public class MapExample {
	
	public static void main(String[] args) {
		
		
		Map<Integer, Student1> map=new HashMap<>();
		
		map.put(2, new Student1("ambuj",23,99));
		map.put(3, new Student1("rohan",34,96));
		map.put(4, new Student1("abhay",67,90));
		
		for(Map.Entry m: map.entrySet()) {
			int key=(int)m.getKey();
			Student1 value=(Student1) m.getValue();
			System.out.println(key + " " + value);
		}
		
		//using getter and setter
//		Student s=new Student("ambuj",45,90);
//		s.setMarks(100);
//		System.out.println(s.getName());
		
		
	}

}
