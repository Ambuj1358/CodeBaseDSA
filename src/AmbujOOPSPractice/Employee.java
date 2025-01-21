package AmbujOOPSPractice;

//encalsuation
public class Employee {
	
	private String name;
	private int age;
	private double salary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
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
		if(age<0) {
			System.out.println("Age should be positive");
			return;
		}
		this.age = age;
	}

	public double getSalary() {
		
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<0) {
			System.out.println("negative salary can't be set");
			return;
		}
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	

}
