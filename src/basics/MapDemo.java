package basics;

//import java.util.HashMap;
//import java.util.Map;

import java.util.*;

class Employee{
	private String empName;
	private int empSalary;
	private String empAddress;
	
	Employee(String empName, int empSalary){
		this.empName=empName;
		this.empSalary=empSalary;
		//this.empAddress=empAddress;
		
	}
	
	
	Employee(String empName, int empSalary, String empAddress){
		this.empName=empName;
		this.empSalary=empSalary;
		this.empAddress=empAddress;
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
		}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	
	public String toString() {
		return "Employee [empName= " + empName+ ", EmpSalary= " +empSalary + " empAddress=" + empAddress +"]";
	}
	
	
}

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, Student> map=new HashMap<>();
		map.put(1, new Student("alpha", "Mount Tiago", 45));
		map.put(9,new Student("ambuj", "Denmark", 23) );
		map.put(5, new Student("Bahubali", "Mahishmati"));
		map.put(2,new Student("Bhallaldev","Mahishmati" ));
		
		//System.out.println(map);
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	
		
//		Map<Integer,Employee> map=new HashMap<>();
//		
//		map.put(1,new Employee("ambuj",50000));
//		map.put(2, new Employee("abhay", 40000, "bangalore"));
//		
//		for(Map.Entry m: map.entrySet()) {
//			System.out.println(m.getKey() + " : "+ m.getValue());
//		}
//		Map<Integer, String> hm=new HashMap<Integer, String>();
//		
//		
//		//adding element in map
//		hm.put(3, "ambuj");
//		//hm.put(3, "ambut");
//		hm.put(8, "kumar");
//		hm.put(2, "sharma");
//		hm.put(2,"abhay");
//		hm.put(0, "sharma");
//		hm.put(9, "sharma");
//		hm.put(7, new String("alpha"));
//		
//		System.out.println(hm);
//		//used to get size of map
//		System.out.println(hm.size());
		
		//duplicate key not allowed
		//used to remove all key value pair in map
		//hm.clear();
		//System.out.println(hm);
		
//		System.out.println(hm);
//		
//		hm.remove(2);
//		System.out.println(hm);
//		
//		for(Map.Entry m: hm.entrySet()) {
//			int key=(int) m.getKey();
//			String value=(String)m.getValue();
//			
//			System.out.println(key + " : " +value);
//		}
	
	}

}
