package sigma.Hashing;

import java.util.HashMap;

public class ValidAnagrams {
	
	//function for checking valid anagrams-->>>O(N) time complexity
	//in rare case like when put() fun is O(n) then this fun will produce O(n*n)-->when hash fun will produce same bucket index for all key and all
	//node (key value) pair is stored at one only single index
	public static boolean isValid(String str1,String str2) {
		
		if(str1.length()!=str2.length()){
			return false;
		}
		
		
	
     HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;  i<str1.length();  i++) {
			char ch=str1.charAt(i);
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(int i=0;  i<str2.length();  i++) {
			char ch=str2.charAt(i);
			
			if(map.containsKey(ch)) {
				if(map.get(ch)==1) {//check this as 0 value in map has no literal meaning, will produce error
					map.remove(ch);
				} else {
					map.put(ch, map.get(ch)-1);
				}
				
			
//			if(map.get(ch)!=null) {//means value is valid ie present in map
//				if(map.get(ch)==1) {
//					map.remove(ch);
//				} else {
//					map.put(ch, map.get(ch)-1);
//				}
			} else {
				return false;//when 2nd index has diff char or bigger
			}
			
			
	 }
		//thing on->>>"ambuj kumar" and "ambuj" two string and "ambuj", "ambuj"
		return map.isEmpty() ;//when 1st index is bigger
}
		
		
	
	public static void main(String[] args) {
		
		String str1="race";
		String str2="care";
		
		
			System.out.println(isValid(str1, str2));
			
		
		
		
		
		
	}

}
