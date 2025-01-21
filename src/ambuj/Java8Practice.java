package ambuj;

public class Java8Practice {
	
	public static void main(String[] args) {
//		walkable obj=new walking();
//		
//		obj.walk(5);
		
		//valid only for functinal interface where interface has only one method
		walkable obj=(steps)->{
			System.out.println("walking in hurry");
			return 2*steps;
		};
		
		obj.walk(5);
		
		
		
		
		
	}

}

interface walkable{
	int walk(int steps);
}

//there are two methods to create instance of this interface(walkable) ->>one is older one in which we will imolement this interface using
//some other class and will make object of another class->>then implement walk method
//2nd one is lamda expression

class walking implements walkable{

	@Override
	public int walk(int steps) {
		// TODO Auto-generated method stub
		System.out.println("walking fast");
		return steps;
	}
	
	
	
}