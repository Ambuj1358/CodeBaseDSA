package basics;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set
		
		HashSet<String> set=new HashSet<>();
		set.add("ambuj");
		set.add("kumar");
		set.add("Malhotra");
		set.add("kumar");
		set.add("garg");
		
		
		//System.out.println(set);
		//System.out.println(set.getClass());
		
		TreeSet<String> trs=new TreeSet<>();
		//trs.addAll(set);
		trs.add("ambuj");
		trs.add("sharma");
		trs.add("kumar");
		//trs.equals(set);
		//System.out.println(trs.isEmpty());
		//System.out.println(trs.contains("ambuj"));
       // System.out.println("welcome to code java");
		//ArrayList<String> list=new ArrayList<>();
		
		//ArraYlIST  is typesafe
		//for adding element
//		list.add("ambuj");
//		list.add("kumar");
//		list.add("sharma");
//		//checking for duplicates->allowed
//		list.add("sharma");
//		list.add(0,"alpha");
		//list.set(0, "alpha");
		//System.out.println(list);
		
//		Vector<String> vector=new Vector<>();
//		vector.addAll(list);
//		System.out.println(vector);
		
		//list.clear();
		//System.out.println(list);
		//System.out.println(list.isEmpty());
		
		//check item is there or not
		//type ka equal method call karta hain check karne ke liye
	//	System.out.println(list.contains("sharma"));
		//System.out.println(list.size());
		
		//System.out.println(list);
		
		//for getting element index wise
		//System.out.println(list.get(0));
		//list.get(int index)-> will give u index wise data
		//order preserve
		//System.out.println(list.get(2));
//		
//		list.remove("kumar");
//		System.out.println(list);
//		
//		list.remove(1);
//		System.out.println(list);
//		list.remove("rohan");
		
		
//		for(String s:list) {
//		//	System.out.print(s + " ");
//		}
		//LinkedList is type unsafe
//		LinkedList name=new LinkedList();
//		name.add("ambuj");
//		name.add(23);
//		name.remove("23");
//		System.out.println(name);
//		System.out.println(name.get(0));
		
//		for(Object s:name) {
//			System.out.println(s);
//		}
		
		List<Integer> lis=new ArrayList<>();
		lis.add(6);
		lis.add(6);
		lis.add(6);
		lis.add(4);
		lis.add(3);
		lis.add(8);
		lis.add(6);
		lis.add(1);
		lis.add(1);
		lis.add(1);
		System.out.println(lis);
		Collections.reverse(lis);
		System.out.println(lis);
		
		Set<Integer> tr=new TreeSet<>();
		tr.addAll(lis);
		//System.out.println(tr);
		//Set<String> str=tr.descendingSet();
		
		//Set<Integer> str=tr.descendingSet();
		TreeSet<String> ts=new TreeSet<>();
		ts.add("kumar");
		ts.add("verma");
		ts.add("hello");
		ts.add("rohan");
		System.out.println(ts);
	//	Collections.reverse(trs);
		
		Set<String> str=ts.descendingSet();
		for(String s:str) {
			//System.out.println(s);
		}
		
		TreeMap<String, Integer> trm=new TreeMap<>();
		//keywise sprting here
		trm.put("ambuj", 1);
		trm.put("rohan", 9);
		trm.put("kumar", 5);
		trm.put("garg", 3);
		//System.out.println(trm);
		
		
	}

}
