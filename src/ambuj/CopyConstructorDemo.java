package ambuj;

public class CopyConstructorDemo {
	
	public static void main(String[] args) {
		Person p1=new Person("Ambuj",25);//obj value initilised with parametriesed constructor
		Person p2=new Person(p1);//obj value intilised with copy constructor
	//	p1.setAge(-23);//means nobody can set the age as negative
		
		
		Person p3=new Person("Abhishek",26);
		Person p4=new Person(p3);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p3);
		System.out.println(p4);
	}

}

class Person  {
	
	private String name;
	private int age;
	
	//no argument constructor
	Person(){
		
	}
	
	//constructor can throw more exception like->>name null,age -ve
	
	//constructor with all parameters->>parameterized constructor
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	//copy constructor
	Person(Person demo){//visibilty is default->>within package
		
		if(demo==null) {
			throw new IllegalArgumentException("Obj being copied is null");
		}
		this.name=demo.name;
		this.age=demo.age;
	}
	
	//Getter and setter function to access private data fields
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>=0) {
			this.age=age;
		} else {
			throw new IllegalArgumentException("Age can not be negative");
		}
		
	}
	
	
	
	
	
	@Override
	public String toString() {//return String repersentation of object
		return "Person [name=" + name + ", age=" + age + "]";
	}


	
}


