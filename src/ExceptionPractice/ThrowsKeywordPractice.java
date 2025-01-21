package ExceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordPractice {
	
	public  void find() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("d://abc.txt");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ThrowsKeywordPractice tp=new ThrowsKeywordPractice();
		//tp.find();
		
		try {
			tp.find();
		} catch(FileNotFoundException e) {
			System.out.println("File not found in ur system");
		}
		System.out.println("Hello ambuj");
		
	}

}
