package practice;

public class palindromicString {
	
	//method 1 for palindrome checking
		public static boolean isPalindrome(String str) {
			for(int i=0;  i<str.length();  i++) {
				if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
					return false;
				}
			}
			
			return true;
		}
		
		//method 2 for palindrome checking
		public static boolean isPalindrome2(String str) {
			String rev="";
			int n=str.length();
			for(int i=0;  i<n;  i++) {
				rev+= str.charAt(n-1-i);
			}
			
			if(rev.equals(str)) {
				return true;
			}
			return false;
			
		}
		
		//function for revrse string
		public static String rev(char[] arr) {
			int n=arr.length;
			for(int i=0;  i<n/2;  i++) {
				char temp=arr[i];
				arr[i]=arr[n-1-i];
				arr[n-1-i]=temp;
			}
			
			return new String(arr);
		}
	
	public static void main(String[] args) {
		
		String str="Ambuj";
		
		System.out.println(isPalindrome(str));
		System.out.println(isPalindrome2(str));
		
	}

}
