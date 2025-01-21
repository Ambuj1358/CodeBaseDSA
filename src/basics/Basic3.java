package basics;



public class Basic3 {
	
	
	public static void main(String args[]) {
		//display();
		
		try {
			display();
			throw new MyException("My message");
		}
		catch(ArithmeticException e) {
			System.out.println("Error detected");
		}
		catch(Exception e) {
			System.out.println("Exception found");
		}
		
		
	}
	public static void display() throws ArithmeticException {
		int n=10;
		int result=n/0;
		System.out.println(result);
	}
}

class MyException extends Exception{
	String message;
    MyException(String message){
    	this.message=message;
    }
	
}
