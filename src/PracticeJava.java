
public class PracticeJava {
	
	public static  void main(String[] args) {
		
		
		Animal.initilise("blue");//as there is only one obj can be created
		
		Animal obj1=Animal.getInstance();//null obj created
		//Animal.initilise("black");//no need as it is already initilised
		//obj1.initilise("blue");//initilise
		System.out.println(obj1.hashCode());
		System.out.println(obj1.getColor());
		
		//Ambuj obj1=Ambuj.getInstance();
		
		
		
	//	System.out.println(Ambuj.obj.hashCode());
//		Ambuj obj1=Ambuj.getInstance();//already created object called
//		Ambuj obj2=Ambuj.getInstance();//let's check this is same object or not
//		
//		//Ambuj obj3=new Ambuj();
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
////		
		
//		Ambuj obj1=new Ambuj();
//		Ambuj obj2=new Ambuj();//can;t make obj as constructor is not visible
		
		//They(obj1 and obj2) are diff objects
		
		
		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
		
		
		
	}
	
}

//general class->>make it singleton class
//Singleton class ->>used to make sure that only one instance of class can be created
/**
 * author  ->Ambuj
 */
class Ambuj{
	
	 private final  static Ambuj obj=new Ambuj();//this is static so that access level will be everywhere inside class
	 //final->>no modification in obj we want
	 //private ->>to restrict direct access->>allowing more control
	
	//make default constructor as private so that object can't be created outside the class
	private Ambuj() {
		
	}
	
	//Now to access this object ->>outer class will need something(method)
	public static Ambuj getInstance() {
//		Ambuj obj2=new Ambuj();//new object created->>Breaking singleton design patterm->>to avoid this mark final
//		System.out.println(obj2.hashCode());
//		System.out.println(obj.hashCode());
		//obj=new Ambuj();
		
		return obj;
	}
	
}

//singleton class with method to initilise the object
class Animal{
	private  static Animal obj;
	private   String color;//obj property
	
	private Animal(String color) {
		this.color=color;
	}
	
	//now if obj is not initilised->>initilise with this method
	public static void initilise(String color) {
		if(obj==null) {
			obj=new Animal(color);
		} else {
			throw new RuntimeException("Obj is already initialised");
		}
	}
	
	//now access object 
	public static Animal getInstance() {
		
		
		return obj;
	}
	
	//getter for field color
	public String getColor() {
		return color;
	}
}
