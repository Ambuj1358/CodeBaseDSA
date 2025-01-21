package ambujPractice;

public class Singleton {
	
	public static void main(String[] args) {
		//SingletonDemo obj=new SingletonDemo("ambuj");->>can not be done as constructor visibiloity is set to private
		SingletonDemo.initilise("ambuj");
		
		SingletonDemo obj=SingletonDemo.getInstance();
		System.out.println(obj.getValue());
		
		
		
	}

}


/**
 * Singleton Class Demo
 * Author->>Ambuj
 */
class SingletonDemo  {
	
	private static SingletonDemo obj;
	private String value;
	
	//make a private constructor
	private SingletonDemo(String value) {
		this.value=value;
		
	}
	
	//As this class has only one object so ->>make a function to initilise this object
	public static SingletonDemo initilise(String value) {
		if(obj==null) {
			obj=new SingletonDemo(value);
		} else {
			throw new RuntimeException("object is already initilised");
		}
		
		return obj;
	}
	
	//Now as this object is accessible inside this class only->>to have control over object creation->>make a function to return the created object with given value
	public static SingletonDemo getInstance() {
		if(obj==null) {
			throw new RuntimeException("obj is null");
		} else {
			return obj;
			
		}
		
		
	}
	
	//getter of value
	public String getValue() {
		return obj.value;
	}
}

