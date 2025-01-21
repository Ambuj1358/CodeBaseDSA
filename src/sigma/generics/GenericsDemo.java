package sigma.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericsDemo<M> {
	
	 M obj1;
	 M obj2;
	
	public GenericsDemo(M obj1, M obj2) {
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	void  displayObject() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
	public static void main(String[] args) {
		
		Container<String> 	con1=new Container<String>("Ambuj kumar is a great");
		
		Container<Integer> con2=new Container<Integer>(566);
		
		
		
		System.out.println(con1.getValue());
		
		System.out.println(con1.getClass().getName());
		
         System.out.println(con2.getValue());
		
		System.out.println(con2.getClass().getName());
		
		//That means that, Generics are basically making a class general class with parameter so that it's object type can be defined by end user
		//we can also say it is parameterised types
		//Generics are used to implement type safety in our code base, so that we can pass which types of object we want
		
		
//		GenericsDemo<String> gen=new GenericsDemo<>("Ambuj", "Kumar");
//		
//		gen.displayObject();
//		
//		//ArrayList<E>
//		
		
		
	}

}
