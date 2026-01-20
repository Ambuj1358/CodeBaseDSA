package OopsPractice;

public class Main {
	
	public static void main(String[] args) {
		
		Car2 car=new Car2(100);
		car.startCar();
		car.move();
		
//		Vehicle v1=new Bike(100);
//		Vehicle v2=new Car2(100);
		//  Vehicle v3=new Vehicle();//now allowed as it is not complete class so we cant make object of it
		
//		v1.move();
//		v2.move();
//		Vehicle vehicle=new Vehicle(200);
//		vehicle.move();
//		Car2 car2=new Car2(100);
//		car2.move();
		
	}

}

abstract class Vehicle{
	protected int speed;
	
//	//getter and setter for outside access and modification
//	public int getSpeed() {
//		return speed;
//	}
//	
//	public void setSpeed(int speed) {
//		this.speed=speed;
//	}
	//constructor for object initilisation
	public Vehicle(int speed) {
		this.speed=speed;
	}
	
	//move method for state and behavour
	public abstract void move() ;
}

class Car2 extends Vehicle{
	private Engine engine;
	
	

	public Car2(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
		this.engine=new Engine();
	}
	
	@Override
	public void move() {
		
		System.out.println("my car is moving with speed :" + speed);
	}
	
	public void startCar() {
		engine.start();
		System.out.println("car started");
	}
	
	//Accelerate method
	public void accelerate() {
		//int speed=getSpeed();
	//	speed+=10;//chang in local varivle does not cjange object state->>use setter method
		
		speed=speed+10;
		
		System.out.println("My car is accelarating with speed :" + speed);
		
		
				
	}
	
	
	
	
	
}
class Bike extends Vehicle{
	
	public Bike(int speed) {
		super(speed);
	}
	@Override
	public void move() {
		System.out.println("My Bike is moving with speed :"+ speed);
	}
}
class Engine {
	public void start() {
		System.out.println("Engine strated");
		
	}
}


