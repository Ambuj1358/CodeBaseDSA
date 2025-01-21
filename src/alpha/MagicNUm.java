package alpha;

public class MagicNUm {
	
	//finc for magic num
	public static boolean isMagic(int n) {
		//base case
		if(n/10==0) return n==1;
		
		//recursion
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		
		return isMagic(sum);
	}
	
	//Plindromic string
	public static boolean isPalindrome(String str) {
		
		String rev="";
		
		for(int i=str.length()-1;  i>=0;  i--) {
			rev+=str.charAt(i);
		}
		
		if(rev.equals(str)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
//		System.out.println(isMagic(91));
//		Employee emp=null;
//		emp=new Employee();
		
		System.out.println(isPalindrome("madam"));
		
	}

}
