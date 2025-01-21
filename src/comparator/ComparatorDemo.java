package comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	Integer age;
	double gpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Student(String name, Integer age, double gpa) {
		super();
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	public Student() {
		super();
	}
	
	
	
	
}

class AgeComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
}

public class ComparatorDemo {
	
	
	
	public static void main(String[] args) {
		
		//Comaring string based on length
//		List<String> list=new ArrayList<>();
//		
//		list.add("ambuj");
//		list.add("kumar");
//		list.add("abhishek");
//		list.add("ritu");
//		list.add("so");
//		
//		//list.sort(null);
//		System.out.println(list);
//		
//		//Based on lambda expression
//		list.sort((a,b)->a.length()-b.length());//ascending order sorting
//		System.out.println(list);
//		
//		//descending order sorting by lambda expression
//		list.sort((a,b)->b.length()-a.length());
//		System.out.println(list);
		
		//list.sort(new StringLengthComparator());
		
		//System.out.println(list);
		
		//now we want to sort them based on l=string length
		
		
		List<Integer> list=new ArrayList<>();
		
		list.add(3);
		list.add(9);
		list.add(1);
		list.add(6);
		
		System.out.println(list);
        list.sort(null);	//ascending order sorting
        System.out.println(list);
        
        //ascending order sorting by using lambda expression
        list.sort((a,b)->a-b);//ascending order sorting
        System.out.println(list);
        
        //descending order sorting by lambda expression
        list.sort((a,b)->b-a);
        System.out.println(list);
		
	//	System.out.println(list);
		
//		Collections.sort(list);
//		System.out.println(list);
		
//		list.sort(null);//sorting comparator in natural order by default
//		System.out.println(list);
//		
//		
//		list.sort(Comparator.reverseOrder());
//		System.out.println(list);
//		
//		list.sort(new MyComparator());
//		
//		System.out.println(list);
//		
//		list.sort(new MyComparator());
//		System.out.println(list);
	}

}

//custom comparator 
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		//return o1-o2;//will sot in ascending order->>maintains smaller elem 1st ->>filp when 2nd object is smaller to maintain smaller elem at 1st
		return o2-o1;//will sort in descending order->>maintains bigger elem at 1st->>flip when 2nd obj is bigger to maintain bigger elem at 1st
		
	}
	
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		//return o1.length()-o2.length();//will be sorted based on the length incresig order
		return o2.length()-o1.length();//will be sorted based on decresing len ->>means bigger len will come first
	}
	
	
	
}

