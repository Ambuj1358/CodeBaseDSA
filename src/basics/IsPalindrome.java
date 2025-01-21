package basics;

import java.util.Scanner;

public class IsPalindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(isStrPalindrome(str)) {
			System.out.println("palindromic string");
			
		} else {
			System.out.println("not a palindromic String");
		}
		
	}
	
	public static boolean isStrPalindrome(String str) {
		
		String reversedString="";
		for(int i=str.length()-1;  i>=0;  i--) {
			reversedString+=str.charAt(i);
		}
		
		if(!(str.equals(reversedString))){
			return false;
		}
		return true;
	}

}
