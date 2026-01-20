package OopsPractice;

public class Car {
	
	private String brand;
	private int speed;
	
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
	
	public String accelerate() {
		return "my car is running fast";
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		car.brand="BMW";
		car.speed=100;
		
		System.out.println(car.accelerate());
		System.out.println(car.brand + " " +  car.speed);
	}
	
	

}
