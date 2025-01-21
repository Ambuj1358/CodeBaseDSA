package OOPBasics;

public class Animals {
	
	void eat() {
		System.out.println("eats");
	}
	
	void breathe() {
		System.out.println("Breathes");
	}
	
	//perfect no
	public static int perfectNo(int n) {
		for(int i=1;  i<n;  i++) {
			if(i*i==n) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int count=0;
		
		
		for(int i=5;  i<=10; i++) {
			if(perfectNo(i)!=-1) {
				count++;
			}
		}
		System.out.println(count);
		
//		int n=23;
//		if(perfectNo(n)!=-1) {
//			System.out.println("perfect no");
//		} else {
//			System.out.println("Not a perfect no");
//		}
//		
//		StarFish str=new StarFish();
//		str.breathe();
//		str.swim();
//		str.bright();
//		 
//		Shark s1=new Shark();
//		s1.danger();
//		s1.eat();
//		s1.breathe();
//		s1.swim();
		
		Fish tuna=new Fish();
		//System.out.println();
//		tuna.eat();
//		tuna.swim();
				
	}

}

  class Fish extends Animals{
	  
	  void swim() {
		  System.out.println("Fish can swim");
	  }
	  
	  
	  
  }
  
  class Shark extends Fish {
	  
	  void danger() {
		  System.out.println("very dangerous");
	  }
  }
  
  class StarFish  extends Fish{
	  
	  void bright() {
		  System.out.println("very bright");
	  }
  }
