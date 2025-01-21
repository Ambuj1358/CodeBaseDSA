package comparator;

public class StudentDemo implements Comparable<StudentDemo> {
	
	private String name;
	private int age;
	private double salary;
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
	public StudentDemo(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public StudentDemo() {
		super();
	}
	@Override
	public String toString() {
		return "StudentDemo [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(StudentDemo o) {
		// TODO Auto-generated method stub
		//return this.getAge()-o.getAge();//based on age
		return o.getName().compareToIgnoreCase(this.name);
	}
	
	
	

}
