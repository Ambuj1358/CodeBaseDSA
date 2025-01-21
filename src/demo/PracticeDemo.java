package demo;
import java.util.*;

 class Employee{
	private int empId;
	private String empName;
	private int empSalary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public Employee(int empId, String empName, int empSalary) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public Employee () {
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	
	
	
	
}
public class PracticeDemo {
	
	public static void main(String[] args) {
		
		
		/*
		 * Employee emp=new Employee(); System.out.println(emp);
		 */
		Map<Integer,Employee> map=new TreeMap<>();
		
		map.put(1, new Employee(45,"kumar",100000));
		map.put(67, new Employee(34,"abhay", 200000));
		map.put(26, new Employee(98,"chandra",33000));
		
		for(Map.Entry m : map.entrySet()) {
			int key=(int) m.getKey();
			Object value=m.getValue();
			System.out.println(key +":" +  value);
			
			
		}
		

		
	}

}
