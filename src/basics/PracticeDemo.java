package basics;

public class PracticeDemo {
	
	private String name;
	private String city;
	private int age;
	public PracticeDemo() {
		super();
	}
	public PracticeDemo(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PracticeDemo [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	public static void main(String args[]) {
		
		PracticeDemo demo=new PracticeDemo("ambuj","london",23);
		
		
		System.out.println(demo.getName());
		
	}
	
	

}
