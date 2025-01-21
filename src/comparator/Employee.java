package comparator;

public class Employee implements Comparable<Employee>  {
	
	private String name;
	private int age;
	private double salary;
	private String gender;
	
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(String name, int age, double salary, String gender) {
		super();//calling the constructor of parent class(here object class as no specific parent availbles->>so super parent is object class)
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + "]";
	}
	@Override
	public int compareTo(Employee obj) {
		// TODO Auto-generated method stub
		return this.age-obj.age;
		//based on name
		//return (this.name).compareTo(obj.name);//maintains smaller at start
		//return (obj.name).compareTo(this.name);//maintains bigger elem lexio at start
	}
	
	

}
