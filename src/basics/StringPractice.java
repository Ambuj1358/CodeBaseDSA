package basics;

import java.util.Stack;

public class StringPractice {
	
	//function for doubling characters->every char should be doubled in resultant string
	public static String doublingChar(String str) {
		String newStr="";
		for(int i=0;  i<str.length();  i++) {
			char c=str.charAt(i);
			//newStr+=c +  c + "";//unicode-operator precedence
			//newStr+=""+c +  c ;//fine, will be treated as string only
			newStr+=String.valueOf(c) +  c ;//will be treated as string only
		}
		
		return newStr;
	}
	
	//function for makeout word
	public static String makeOut(String out, String word) {
		
		String newStr=out.substring(0,2) + word + out.substring(2);
		
		return newStr;
	}
	
	//function for firstHalf of string of even length
	public static String firstHalf(String str) {
		int n=str.length();
		String str2="";
		for(int i=0;  i<n/2;  i++) {
			str2+=str.charAt(i);
		}
		return str2;
	}
	
	//function for finding duplicate parenthesis
	public static boolean isDuplicate(String str) {
		Stack<Character> s=new Stack<>();
		
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			
			//closing, as it is single so first
			if(ch==')') {
				int count=0;
			  while(s.pop()!='(') {
				count++;
			  }
			    if(count<1) {
				  return true;
			    }
			} else {
				//openning , operator,operand
				s.push(ch);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String str="(((a+b)))";//(a+b)) this is invalid parenthesis, in question it is mentioned string is already valid
		System.out.println(isDuplicate(str));
		
//		String str="woohoo";
//		System.out.println(firstHalf(str));
		
//		String out="(())";
//		String word="ambuj";
		
	//	System.out.println(makeOut(out, word));
		
//		String str="welcome";
//		System.out.println(doublingChar(str));
		
	}

}
