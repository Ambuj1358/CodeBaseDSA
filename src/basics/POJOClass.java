package basics;


class Student{
	
	private String name;
	private String address;
	private int age;
	//default constructor of Student class
	Student(){
		
	}
	
	Student(String name, String address){
		this.name=name;
		this.address=address;
		//this.age=age;
		
	}
	
	Student(String name, String address, int age){
		this.name=name;
		this.address=address;
		this.age=age;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return " Student [ Name = " + name + ", address = " +address + ", age = "+age + "]";
	}
	

}

public class POJOClass {
	public static void main(String[] args) {
		
		Student s1=new Student("ambuj", "usa" , 23);
		Student s2=new Student();
		System.out.println(s1);
		//System.out.println();
		//System.out.println(s2.getAddress());
//		
//		System.out.println(s.getAddress());
//		s.setAddress("india");
//		System.out.println(s.getAddress());
//		
	}

}
