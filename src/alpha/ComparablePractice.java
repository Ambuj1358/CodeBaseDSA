package alpha;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ComparablePractice {
	
	public static void main(String[] args) {
		
		PriorityQueue<Employee1> list=new PriorityQueue<Employee1>();
		
		list.add(new Employee1("ambuj",25,100000));
		list.add(new Employee1("rohan",30,50000));
		list.add(new Employee1("dilip",22,25000));
		list.add(new Employee1("praneel",27,60000));
		
		while(!list.isEmpty()) {
			Employee1 e1=list.remove();
			System.out.println(e1.name + " " + e1.age + " " + e1.salary);
		}
		
		
	}

}

class Employee1 implements Comparable<Employee1>{
	String name;
	int age;
	int salary;
	
	public Employee1(String name, int age,int salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	@Override
	public int compareTo(Employee1 e) {
		return this.salary - e.salary;//1st-2nd->Ascending order(means initially some emp salary exist and i am comaparing with other emp)
		
	}
}
