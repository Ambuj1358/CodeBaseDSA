import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
	
	//function for fiinding min value in list using stream api
	public static int minValue(List<Integer> list) {
//		list.add(100);
//		list.add(10);
//		list.add(200);
//		list.add(300);
//		
		return list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
	}
	
	//function for max value from list using stream api
	public static int maxValue(List<Integer> list) {
		
		return list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
	}
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(0);
		list.add(25);
		list.add(100);
		list.add(10);
		list.add(2);
		
		Integer min=list.stream().min((i1,i2)->i2.compareTo(i1)).get();	
		Integer max=list.stream().max((i1,i2)->i2.compareTo(i1)).get();//accesses last index->>that's why min ele will come as we have reverse comparator object
//		Integer min= list.stream().min((i1,i2)->i1.compareTo(i2)).get();
//		Integer max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("min is :"+min);
		System.out.println("max is :" +max);
		
		Integer[] arr=list.stream().toArray(Integer[]::new);
		for(Integer i:arr) {
			System.out.println(i);
		}
		
//		System.out.println(minValue(list));
//		System.out.println(maxValue(list));
		
		System.out.println(list);
		List<Integer> list2=new ArrayList<Integer>();
		
		list2=list.stream().sorted().collect(Collectors.toList());
		System.out.println("List according default natural order sorting :" + list2);
		
		List<Integer> list3=new ArrayList<Integer>();
		list3=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());//or (i1,i2)->-i1.compareTo(i2)
		System.out.println("List according to customised sorting by comparator :" + list3);
		
		
//		List<String> list=new ArrayList<>();
//		list.add("pavan");
//		list.add("Raviteja");
//		list.add("chiranjeevi");
//		list.add("venkatesh");
//		list.add("nagarjun");
//		
//		System.out.println(list);
//		
//		//print name if str has length>=9
//		List<String> list2=new ArrayList<String>();
//		list2=list.stream().filter(str->str.length()>=9).collect(Collectors.toList());
//		System.out.println(list2);
//		
//		//now map mechanism->>to convert all character to Uppercase character
//		List<String> list3=new ArrayList<String>();
//		list3=list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
//		
//		System.out.println(list3);
		
		
		
		
	}

}
