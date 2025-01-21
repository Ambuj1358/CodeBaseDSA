package sigma.generics;

import java.util.Comparator;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
	}

}

class  Student {
	private String name;
	private int age;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;//return instance variable
	}
	
}

class AgeCpmparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
