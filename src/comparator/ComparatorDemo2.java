package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import basics.override;

public class ComparatorDemo2 {
	
	public static void main(String[] args) {
		
		//Comparable demo
		List<StudentDemo> list=new ArrayList<StudentDemo>();
		
		list.add(new StudentDemo("Ambuj",25,20000.0));
		list.add(new StudentDemo("Dilip",30,15000.0));
		list.add(new StudentDemo("Pranil",40,10000.78));
		list.add(new StudentDemo("Rohan",24,30000.0));
		list.add(new StudentDemo("kumar",24,30000));
		
		System.out.println("Comparable demo");
		for(StudentDemo st:list) {
			System.out.println(st);
		}
		
	//	Integer
		
		//comparable
		System.out.println();
		System.out.println("defining natural ordering filed in the class so that class know based on whuch field I have to perform natural sorting");
		list.sort(null);
		
		for(StudentDemo st:list) {
			System.out.println(st);
		}
		
		
//		//Now we will try to sort Student obje
	//	List<Student1> list=new ArrayList<>();
//		list.add(new Student1("Ambuj",25,20000));
//		list.add(new Student1("Dilip",30,15000));
//		list.add(new Student1("Pranil",40,10000));
//		list.add(new Student1("Rohan",24,30000));
//		list.add(new Student1("kumar",24,30000));
//		
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
//		
//		System.out.println();
//		
//		System.out.println("sorting based on java 8 static method by age");
//		//use of java 8 static method
//		list.sort(Comparator.comparing(Student1::getAge).thenComparing((s1,s2)->s2.getName().compareToIgnoreCase(s1.getName())));
//		
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
//		
//		
		
		
//		System.out.println("sorting using lambda expression");
//		//Sorting using lamda expression
//		list.sort((o1,o2)->o1.getAge()-o2.getAge());
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
//		
//		//name based sorting
//		list.sort((o1,o2)->o1.getName().compareToIgnoreCase(o2.getName()));
//		
//		System.out.println("sorted based on name using lamda expression");
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
//		
		
//		//sorting by annonymous inner class
//		//sorting by age
//		Comparator<Student1> ageComparator=new Comparator<Student1>(){
//			
//			
//			public int compare(Student1 o1,Student1 o2) {
//				return o1.getAge()-o2.getAge();
//			}
//			
//			
//		};
//		
//		list.sort(ageComparator);
//		
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
//		
//		//Name compartor obj using annonymous inner class
//		Comparator<Student1> nameComparator=new Comparator<>() {
//			public int compare(Student1 o1,Student1 o2) {
//				return o1.getName().compareToIgnoreCase(o2.getName());
//			}
//			
//		};
//		
//		list.sort(nameComparator);
//		System.out.println("Sorted based on name by annonymous inner class");
//		
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
//		Comparator<Student1> comparator=new Comparator<Student1>() {
//			
//			@Override
//			public int compare(Student1 o1, Student1 o2) {
//				// TODO Auto-generated method stub
//				return o1.getAge()-o2.getAge();
//			}
//		};
		
//		//System.out.println(list);
//		
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
//		
//		System.out.println("Sorting based on age");
//		
//		list.sort(new AgeComparator1());
//		
//		//System.out.println(list);
//		
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
//		
//		System.out.println("sorting based on name");
//		list.sort(new NameComparator());
//		
//		for(Student1 st:list) {
//			System.out.println(st);
//		}
		
		
//		
//		List<Integer> list=new ArrayList<>();
//		
//		list.add(1);
//		list.add(9);
//		list.add(3);
//		list.add(0);
//		list.add(10);
//		
//		System.out.println(list);
		
		//sort in natural order
		//1st method
		//Collections.sort(list,Comparator.reverseOrder());
		//sort without using Collections class
		//method 2
	//	list.sort(Comparator.reverseOrder());
		//list.sort(null)->>natural order sorting
		
		//method 3->>lambda expression
	//	list.sort((obj1,obj2)->obj1-obj2);//maintains smaller elem at start as -ve ->>no swap
//		list.sort((obj1,obj2)->obj2-obj1);//maintains bigger elem at 1st as for -ve->>no swap and it will be -be when 1st elem is bigger
//		
//		
//		System.out.println(list);
		
		
	}

}

class Student1  {
	String name;
	int age;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Student1(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Student1() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	
	
	
}

class AgeComparator1 implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();//ascending order of age
		//return o1.getName().compareToIgnoreCase(o2.getName());
	}

	
	
}

class NameComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	
}

