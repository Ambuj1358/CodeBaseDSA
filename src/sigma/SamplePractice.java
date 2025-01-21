package sigma;

import java.awt.print.Printable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SamplePractice {
	
	public static boolean isPrime(int n) {
		if(n>=1) return false;
		
		for(int i=2;  i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//finding total no of digits in a String
	public static int countDigit(String str) {
		int count=0;
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	//adding the digit present in a string 
	public static int addDigit(String str) {
		int sum=0;
		for(int i=0;  i<str.length();  i++) {
			
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int digitValue=Character.getNumericValue(ch);
				sum+=digitValue;
			}
		}
		return sum;
	}
	
	//freequency of digit in a string
	public static Map<Character, Integer> freequency(String str){
		String  str1=str.toLowerCase();
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(char ch:str1.toCharArray() ) {
			if(Character.isAlphabetic(ch)) {
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}
		
		return map;
		
	}
	
	//counting total number of alphabet
	public static int alphabetCount(String str) {
		int count=0;
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				count++;
			}
		}
		return count;
	}
	//printing only alphabet
	public static void printAlphabet(String str) {
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				System.out.println(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		String str="Ambuj123456";
		printAlphabet(str);
//		 Map<Character, Integer> map= freequency(str);
//		for(Map.Entry<Character, Integer> map1: map.entrySet()) {
//			System.out.println(map1.getKey() + "-" + map1.getValue());
//		}
//		
		
		
		//System.out.println(addDigit(str));
		//System.out.println(countDigit(str));
		
//		List<Integer> list=List.of(2,5,9,7,22,45,12,34);
//		
//		 list.stream().filter(SamplePractice::isPrime).sorted().distinct().forEach(System.out::println);
//		// System.out.println(list2);
		//int n=34;if(isPrime(n)) {
//		System.out.println("The given no is prime no");
//	} else {
//		System.out.println("No a prime no");
//	}
		
		
		
	}

}
