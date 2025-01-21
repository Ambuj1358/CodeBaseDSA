package basics;

public interface Hello {
	
	void display();
	
	default void doSomething() {
		System.out.println("Hello Ambuj, I am from Hello interface");
	}

}
