package basics;

public class Tiger extends Animal {
	
	public void human() {
		System.out.println("Hey I am impl. of Human method");
	}

	public static void main(String[] args) {
//		Tiger t=new Tiger();
//		
//		t.human();
//		t.actor();
//		
		//Finding the sum of internal digit of string
		String str ="234asdf6";
		
		int sum=0;
		
		for(char c:str.toCharArray()) {
			if(Character.isDigit(c)) {
			
			
			int i = Integer.parseInt(String.valueOf(c));
			sum =sum +i;
			}
		}
		System.out.println(sum);
		
	}

}
