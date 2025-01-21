package basics;

public interface Hello2 {
	
	void display();
	
	default void doSomething() {
		System.out.println("Hello Ambuj, I am from Hello2 interface");
	}

}
