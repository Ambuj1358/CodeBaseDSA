package OopsPractice;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle vehicke=new Bike(100);
		Vehicle vehicke2=new Car2(100);
		
		vehicke.move();
		vehicke2.move();
//		Vehicle vehicle=new Vehicle(200);
//		vehicle.move();
//		Car2 car2=new Car2(100);
//		car2.move();
		
	}

}

class Vehicle{
	protected int speed;
	
	//getter and setter for outside access and modification
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	//constructor for object initilisation
	public Vehicle(int speed) {
		this.speed=speed;
	}
	
	//move method for state and behavour
	public void move() {
		//speed+=10;
		System.out.println("My vehicle is moving with speed :" + speed);
	}
}

class Car2 extends Vehicle{
	
	

	public Car2(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move() {
		
		System.out.println("my car is moving with speed :" + speed);
	}
	
	//Accelerate method
	public void accelerate() {
		//int speed=getSpeed();
	//	speed+=10;//chang in local varivle does not cjange object state->>use setter method
		
		setSpeed(speed+10);
		
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
