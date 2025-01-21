package practice;

public class Substring {
	
	//Substring method
	
		public static String substring(String str,int si, int ei) {
			String substr="";
			
			for(int i=si;  i<ei;  i++) {
				substr+=str.charAt(i);
			}
			return substr;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="rohan";
		System.out.println(substring(str, 0, str.length()));

	}

}
