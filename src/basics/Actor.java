package basics;

public class Actor extends Human {
	
	public void playMusic() {
		System.out.println( name +  " can play music");
	}
	public void walk() {
		System.out.println( name+ " will walk like this");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here Human is reference pointing to new Actor() is object
		Actor a=new Actor();
		a.name="Ambuj";
		
		a.playMusic();
		a.walk();

	}

}
