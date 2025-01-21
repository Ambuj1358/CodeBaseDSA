package basics;
import java.util.*;
public class IterationDemo {

	public static void main(String[] args) {
		
		HashMap<String ,Integer> has=new HashMap<>();
		has.put("ambuj", 1);
		has.put("kumar", 2);
		has.put("sharma", 3);
		has.put("garg", 5);
		//System.out.println(has);
		has.forEach((e1,e2)->{
			//System.out.println(e1+ " "+ e2);
		});
		//System.out.println(has.containsKey("ambuj"));
		//System.out.println(has.containsValue(5));
		//has.clear();
		//System.out.println(has);
       ArrayList<String> list=new ArrayList<>();
       list.add("alpha");
       list.add("bita");
       list.add("gama");
       list.add("delta");
       list.forEach(e->{
    	  // System.out.println(e);
       });
       //System.out.println(list.hashCode());
       
       //for each loop for iteration: same way to traverse every collection either hashSet, treeSet arraylist,linkedlist,vector, stack
//       for(String s : list) {
//    	   System.out.print(s + "\t" + s.length() + "\t");
//    	   StringBuilder sbr=new StringBuilder(s);
//    	   System.out.println(sbr.reverse());
//       }
       //using iterator for iterating over collection
//       Iterator<String> itr=list.iterator();
//       while(itr.hasNext()) {
//    	  String str= itr.next();
//    	  System.out.println(str);
//       }
       TreeSet<String> trs=new TreeSet<>();
       trs.add("goa");
       trs.add("bangalore");
       trs.add("chennai");
       trs.add("chennai");
       trs.add("pune");
      // trs.listIterator();
//       
//       
//       Iterator<String> itr=trs.iterator();
//       while(itr.hasNext()) {
//    	   String str=itr.next();
//    	   System.out.println(str);
//       }
       
       //ListIterator for traversing
//      ListIterator<String> ir= list.listIterator(list.size());
//      
//      while(ir.hasPrevious()) {
//    	 String str= ir.previous();
//    	  System.out.println(str);
//      }
       //iterating on collection using ForEach method
       list.forEach(str->{
    	 //  System.out.println(str);
       });
       
       trs.forEach(e->{
    	  // System.out.println(e);
       });
       // Iterating on vector using Enumeration 
       Vector<String> vr=new Vector<>();
       vr.add("alpha");
       vr.add("delta");
       vr.add("ureka");
       vr.add("elephant");
       Enumeration<String> e=vr.elements();
       while(e.hasMoreElements()) {
    	  String str= e.nextElement();
    	 // System.out.println(str);
       }
       //TreeMap implementation
       TreeMap<Integer, String> str=new TreeMap<>();
       str.put(3,"ambuj");
       str.put(8, "kumar");
       str.put(1, "sharma");
       str.put(0, "Malhotra");
       //keywise sorting in treemap
      // System.out.println(str);
       //order is preserved in linkedHasgset
       
       Set<Integer> s=new LinkedHashSet<>();
        s.add(1);
        s.add(8);
        s.add(3);
        s.add(0);
        System.out.println(s);
        
        Stack<Integer> st=new Stack<>();
        st.add(4);
        st.add(2);
        System.out.println(st);
       
       System.out.println(st.firstElement());
	}

}
