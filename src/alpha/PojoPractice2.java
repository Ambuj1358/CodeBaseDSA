package alpha;

import java.util.*;

public class PojoPractice2 {
	
	
	
	public static void main(String[] args) {
		
		List<Person> list=new ArrayList<>();
		list.add(new Person(25,"ambuj") );
		list.add(new Person(35,"Animesh") );
		list.add(new Person(45,"praneel") );
		list.add(new Person(40,"dilip") );
		
		//Comparator<Person> c=(Person p1,Person p2)-> {return p2.getAge()-p1.getAge();};
			
//		Collections.sort(list,(Person p1,Person p2)->p2.getAge()-p1.getAge());
//		Integer.com
//		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}

class Person implements Comparable<Person> {
	
	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Person() {
		super();
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		return  o.getAge()-this.getAge();//descending order
	}
	
	
}
