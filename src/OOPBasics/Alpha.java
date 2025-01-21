package OOPBasics;

public  class Alpha {

	
	public static void main(String[] args) {
		
		Bear br=new Bear();
		
		br.eat();
		
		//Dog tony =new Dog();
		
//		tony.eat();
//		tony.walk();
		
		
	}
}

//multiple inheritance using interfaces

interface Herbivore {
	
	void eat();//method is by default public and abstract
	
}
  interface Carnivore{
	  void eat(); //method is by default  public and abstract
  }
  
  class Bear implements Herbivore, Carnivore{
	  
	  //this method must be declared public , because interface has said to do this
	public  void eat() {
		  System.out.println("can eat both veg and meat");
	  }
	  
  }
abstract class Animal {
	
	Animal(){
		System.out.println("Animal constructor called");
	}
	void eat() {
		System.out.println("eats");
	}
	
	abstract void walk();
	
}

class Dog extends Animal{
	
	Dog(){
		System.out.println("Dog constructor called");
	}
	
	void walk() {
		System.out.println("Walks on 4 legs");
	}
}


