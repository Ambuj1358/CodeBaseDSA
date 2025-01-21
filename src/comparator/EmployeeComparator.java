package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator {
	
	public static void main(String[] args) {
		//Employee emp=new Employee("Ambuj",25,30000.0,"male");//emp obj
		//we have to store data of many employee->>so use list
		
		List<Employee> list=new ArrayList<Employee>();//this list will store employee object only
		
		list.add(new Employee("ambuj",25,30000.0,"male"));
		list.add(new Employee("dilip",30,40000.0,"male"));
		list.add(new Employee("abhishek",35,100000.0,"male"));
		list.add(new Employee("rohan",16,60000.0,"male"));
		list.add(new Employee("abhay",26,90000.0,"male"));
		list.add(new Employee("sohan",23,30000.0,"male"));
		list.add(new Employee("alpha",23,30000.0,"male"));
		list.add(new Employee("bita",23,30000.0,"male"));
		
		for(Employee emp:list) {
			System.out.println(emp);
		}
		System.out.println();
		
		//Complex sorting using java 8 static method and multiple field for sorting
		
		list.sort(Comparator.comparing(Employee::getAge).thenComparing(Comparator.comparing(Employee::getName).reversed()));
		for(Employee emp:list) {
			System.out.println(emp);
		}
		System.out.println();
		
//		
//		//Sorting using lambda expression
//	//	list.sort((obj1,obj2)->obj1.getAge()-obj2.getAge());
//		list.sort((obj1,obj2)->obj1.getName().compareTo(obj2.getName()));
//		System.out.println("sorting using lambdaa expression in ascending order of name");
//		
//		for(Employee emp:list) {
//			System.out.println(emp);
//		}
//		
//		//using java static methods
////		list.sort(Comparator.comparing(Employee::getName));
////		list.sort(Comparator.comparing(Employee::getAge).reversed());
//
//		
//		System.out.println();
//		
//		//in descending order
//		//list.sort((obj1,obj2)->obj1.getAge()-obj2.getAge());
//		list.sort((obj1,obj2)->obj2.getName().compareTo(obj1.getName()));
//		System.out.println("sorting using lambdaa expression in descending  order of name");
		
//		for(Employee emp:list) {
//			System.out.println(emp);
//		}
//		//sorting using annonymous inner class using comparator
//		Comparator<Employee> ageComparator=new Comparator<Employee>() {
//			
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.getAge()-o2.getAge();//we can use any field to sort
//			}
//		};
//		
//		list.sort(ageComparator.reversed());//will be sorted in ascending order of employee age
//		System.out.println("Sorting based on employee age in descending order");
//		
//		for(Employee emp:list) {
//			System.out.println(emp);
//		}
//		
		
		
//		//sorting using custom comparator class
//		System.out.println("sorting based on age with the help of comparator");
//		list.sort(new AgeComparator2());
//		for(Employee emp:list) {
//			System.out.println(emp);
//		}
//		
//		System.out.println();
//		
//		list.sort(new NameComparator2());
//		System.out.println("sorting based on name comparator");
//		
//		for(Employee emp:list) {
//			System.out.println(emp);
//		}
//		
		
		//Sort them using natural order,custom order with comparator and define order for sorting field using comparator
//		//define the field for natural sorting
//		
//		list.sort(null);
//		System.out.println("Sorting based on age of employee");
//		//System.out.println("Sorting based on name in lexiographical order of employee");
//		for(Employee emp:list) {
//			System.out.println(emp);
//		}
//		System.out.println();
//		
//		//reverse order sorting
//		list.sort(Comparator.reverseOrder());
//		System.out.println("Sorting based on employee age in reverse order");
//		//System.out.println("Sorting based on employee name in lexiographical reverse order  of employee");
//		for(Employee emp:list) {
//			System.out.println(emp);
//		}
		//we can also change the field for natural sorting->but for more than one sorting field at a time->>use comparator
		
//		List<Integer> list2=new ArrayList<>();
//		list2.add(8);
//		list2.add(1);
//		list2.add(5);
//		list2.add(9);
//		list2.add(0);
//		
//		System.out.println(list2);
//		
//		
//		Collections.sort(list2);
//		System.out.println("Assending order of data :" + list2);
//		
//		Collections.sort(list2,Comparator.reverseOrder());
//		System.out.println("Descending order of data :"+ list2);
//		
//		list2.sort(null);
//		System.out.println("Ascending order:" + list2);
//		
//		list2.sort(Comparator.reverseOrder());
//		
//		System.out.println("Descending  order:" + list2);
	}
	

}

class AgeComparator2 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();//ascending irder sorting
	}
	
}

class NameComparator2 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());//ascending order
	}
	
	
}





