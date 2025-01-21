package alpha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	
	private String name;
	private int age;
	private String address;
	private String gender;
	private int salary;
	private String department;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String name, int age, String address, String gender, int salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + ", salary="
				+ salary + ", department=" + department + "]";
	}
	
	
	
}

class Implementation {
	
	public static Map<String, Integer> getNumber(List<Employee> list){
		
		Map<String, Integer> map=new HashMap<>();
		
		  int maleCount= (int) list.stream().filter(n->n.getGender().equalsIgnoreCase("male")).count();
		  int femaleCount= (int) list.stream().filter(n->n.getGender().equalsIgnoreCase("female")).count();
		  
		  map.put("Male", maleCount);
		  map.put("Female", femaleCount);
		return map;
		
		
	}
	
	public static List<String> getName(List<Employee> list){
		
		List<String> list1= list.stream().filter(n->n.getDepartment().equalsIgnoreCase("developer")).map(n->n.getName()).collect(Collectors.toList());
		
		
		return list1;
		
	}
}
public class PojoUsingMap {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Ambuj", 23, "london", "male", 50000, "Developer");
		Employee emp2 = new Employee("Rohan", 56, "Australia", "male", 100000, "HR");
		Employee emp3 = new Employee("daya", 45, "Malesia", "female", 200000, "Finance");
		Employee emp4 = new Employee("sohani", 43, "usa", "female", 1000000, "Developer");

		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Implementation imp=new Implementation();
		
		
	//System.out.println(imp.getNumber(list));
	imp.getName(list).forEach(n->{
		System.out.println(n);
	});
		
	}
	    
	
	
	

}
