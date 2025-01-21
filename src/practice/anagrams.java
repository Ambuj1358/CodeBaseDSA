package practice;

import java.util.Arrays;

public class anagrams {
	
	// Function for Anagrams of a String , time complexity->O(N^2)
	//-same character with same freequency, oredr may be different
	
		public static boolean isAnagrams(String str1, String str2) {
			int n1=str1.length();
			int n2=str2.length();
			
			char[] str1Array=str1.toCharArray();
			char[] str2Array=str2.toCharArray();
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			if(n1!=n2) {
				return false;
			}
			
			boolean result=Arrays.equals(str1Array, str2Array);
			
			
					
					
			
			return result;
		}
		
	
	public static void main(String[] args) {
		
		String str="ambuj";
		String str2="kumar";
		System.out.println(isAnagrams(str, str2));
		
	}

}
