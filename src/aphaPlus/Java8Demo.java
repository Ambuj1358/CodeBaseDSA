package aphaPlus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(10);
		list.add(29);
		list.add(40);
		list.add(37);
		
		System.out.println(list);
		
		//now if we want the even no only ->>without stream
//		ArrayList<Integer> list2=new ArrayList<Integer>();
//		for(Integer i:list) {
//			if(i%2==0) {
//				list2.add(i);
//				
//			}
//		}
		
	//	System.out.println(list2);
		
		//with stream ->finding even no
//		List<Integer> list3=new ArrayList<Integer>();
		
//		list3=list.stream().filter(i->i%2==0).collect(Collectors.toList());		
//		System.out.println(list3);
		
		
		//Now map demonstartion
		//let's say we want every element to be double of original list
		//without stream api
		List<Integer> list4=new ArrayList<Integer>();
		for(Integer i:list) {
			list4.add(i*2);
		}
		System.out.println(list4);
		
		//with stream api
		List<Integer> list5=new ArrayList<Integer>();
		
		list5=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(list5);
		
		
		
		
		
	}

}
