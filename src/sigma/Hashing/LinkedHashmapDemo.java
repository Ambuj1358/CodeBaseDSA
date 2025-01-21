package sigma.Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


//LinkedHashMap preserves insertion order of element ,HashMap does not preserve insertion order
public class LinkedHashmapDemo {
	
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		
		lhm.put("India", 100);
		lhm.put("china", 150);
		lhm.put("usa", 70);
		lhm.put("nepal", 10);
		lhm.put("Bhutan", 34);
		
		System.out.println(lhm);//insertion order preserved
		
		Map<String, Integer> hm=new HashMap<String, Integer>();
		
		hm.put("India", 100);
		hm.put("china", 150);
		hm.put("usa", 70);
		hm.put("nepal", 10);
		hm.put("Bhutan", 34);
		
		System.out.println(hm);//insertion order not preserved
		
		
	}

}
