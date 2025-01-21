package basics;


class Animals{
	//private methods can not be inherited
	private void eat() {
		System.out.println("I am eating");
	}
	
	//constructors can not be inherited
	Animals(){
		
	}
}
//single level inheritance
class AB extends Animals{
	
	void show() {
		System.out.println("I am here");
	}
	
}
//multilevel inheritance as AB
//Hierarchical inheritance
public class Dog extends Animals {

	void run() {
		System.out.println("I am running");
	}

	public static void main(String[] args) {
		
		AB ab=new AB();
		ab.show();
		//ab.eat();
		
		
		
		Dog d=new Dog();
		//d.eat();
//		d.show();
//		d.eat();
		
//		Dog d=new Dog();
//		d.eat();
//		d.run();
//		Animals a=new Animals();
//		a.eat();
		
		
		
//		OopsBasic op=new OopsBasic("ambuj",234);
//		System.out.println(op.name + " " + op.empId);

	}

}
