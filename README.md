package OopsPractice;

public class Car {
	
	private String brand;
	private int speed;
	
	public Car(String brand,int speed) {
		this.brand=brand;
		this.speed=speed;
	}
	
	//NO need of getter and setters as we are going to call these fields inside this class only
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand=brand;
//	}
//	
//	public int getSpeed() {
//		return speed;
//	}
//	
//	public void setSpeed(int speed) {
//		this.speed=speed;
//	}
	
	//state + behavour change
	public void accelerate() {
		speed+=10;
		
		System.out.println("My car is accelarating at speed :" + speed);
		
		
	}
	
	public void retard() {
		speed-=10;
		
		System.out.println("My car is retarding at speed :" + speed);
	}
	
	public static void main(String[] args) {
		Car car=new Car("BMW",100);
		
		
		car.accelerate();
		System.out.println(car.brand + " " +  car.speed);
		
		car.retard();
	}
	
	

}
