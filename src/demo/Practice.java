package demo;



class Human{
	public void dance() {
		System.out.println("Human can dance");
	}
}

class Actor extends Human{

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		super.dance();
		//System.out.println("Actor can also dance sala");
	}
	
	
}

public class Practice {
	public static void main(String[] args) {
		Actor ac=new Actor();
		ac.dance();
		
	}

}
