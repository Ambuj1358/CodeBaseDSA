package basics;

public class Sample {
	String name;
	String gender;
	int age;
	Sample(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		Sample s=new Sample("ambuj" , 29);
//		s.name="ambuj";
		System.out.println(s.name);
		
	}
}
