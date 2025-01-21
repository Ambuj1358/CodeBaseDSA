package sigma.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterationOnHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
				
		hm.put("India", 100);
		hm.put("chine", 150);//not giving error as key is same but value get updated at each level
		hm.put("USA", 50);
		hm.put("Nepal", 5);
		hm.put("Bhutan", 6);
		
		//iteration on map
		//O(1)
		Set<String> keys=hm.keySet();//here all the key of map is stored inside a set called keys and can be accesed from this set
		System.out.println(keys);//will be printed  as set
		//set is also an unordered collection
		
		//for each loop-O(n)-n being no of keys
		for(String k: keys) {
			System.out.println("key=" + k + ", value=" + hm.get(k));
		}
		
		//there is a entrySet() function which gives key value pair together
		for(Entry<String, Integer> h: hm.entrySet()) {
			System.out.println(h);
		}
		
		
		
	}

}
