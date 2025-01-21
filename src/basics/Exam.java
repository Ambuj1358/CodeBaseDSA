package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Custom unchecked Exception practice
class YoungerAgeException extends RuntimeException{
	
	YoungerAgeException(String msg){
		super(msg);
	}
	
	
}
public class Exam {
	
	void read() throws FileNotFoundException  {
		FileInputStream fis=new FileInputStream("d:/abc.txt");
		
		
	}
	public static void main(String[] args) {
		
		Exam ex=new Exam();
	//	Sogeti s=new Sogeti();
		
		
			try {
				ex.read();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("FileNotFoundException Handled Successfully");
//		}
//		catch(Exception e) {
//			System.out.println("Parent Exception may come");
//		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int age =sc.nextInt();
//	try {
//		
//	
//		if(age<20) {
//			throw new YoungerAgeException("You can't vote");
//		} else {
//			System.out.println("You can vote");
//		}
//		
//	} catch(YoungerAgeException e) {
//		System.out.println("Exception handled syccessfully");
//	}
//		
		
	}

}
