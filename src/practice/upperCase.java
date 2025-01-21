package practice;

public class upperCase {
	
	//function to make first letter string upper case->time complexity O(N)
	
		public static String upperCase(String str) {
			
			StringBuilder sbr=new StringBuilder("");
			
			char ch=Character.toUpperCase(str.charAt(0));
			sbr.append(ch);
			
			for(int i=1;  i<str.length();  i++) {
				if(str.charAt(i)==' ' && i<str.length()-1) {
					sbr.append(str.charAt(i));
					i++;
					sbr.append(Character.toUpperCase(str.charAt(i)));
				} else {
					sbr.append(str.charAt(i));
				}
			}
			return sbr.toString();
		}
		
	
	public static void main(String[] args) {
		
		String str="ambuj kumar sharma";
		
		System.out.println(upperCase(str));
		
	}

}
