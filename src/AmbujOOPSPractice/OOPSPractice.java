package AmbujOOPSPractice;

public class OOPSPractice {
	
	public static void main(String[] args) {
		Employee emp=new Employee("Ambuj",25,30000);
		
		System.out.println(emp);
		
		emp.setAge(-23);
		System.out.println(emp);
		
		emp.setSalary(50000);
		System.out.println(emp);
		
		emp.setSalary(-23000);
		System.out.println(emp);
	}

}
