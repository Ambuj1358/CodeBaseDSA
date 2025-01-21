package sigma;

import java.util.ArrayList;

public class MultiDimensionalArrayList {
	
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2=new ArrayList<>();

		list2.add(4);
		list2.add(5);
		list2.add(6);
		mainlist.add(list1);
	    mainlist.add(list2);
	    
	    for(int i=0;  i<mainlist.size();  i++) {
	    	ArrayList<Integer> currlist=mainlist.get(i);
	    	
	    	for(int j=0;  j<currlist.size();  j++) {
	    		System.out.print(currlist.get(j) + " ");
	    	}
	    	System.out.println();
	    }
		
	}

}
