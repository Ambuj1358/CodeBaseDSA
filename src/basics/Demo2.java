package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {
	
	public static boolean isPrime(int n) {
		
		if(n<=1)return false;
		
		for(int i=2;  i<=Math.sqrt(n);  i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static List<Integer> generatePrimeNumbers(int limit){
		List<Integer> primeNumbers=new ArrayList<>();
		
		for(int i=2;  i<=limit;  i++) {
			if(isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
		
		
		
		
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		
		//List<Integer> generatedPrimeNumber=generatePrimeNumbers(limit);
		System.out.println(generatePrimeNumbers(limit));
		
		
	}

}
