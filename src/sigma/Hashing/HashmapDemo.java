package sigma.Hashing;

import java.util.HashMap;

public class HashmapDemo {
	
	public static void main(String[] args) {
		
		//Hashmap->key value pair
		//operation ->add,get,containskey,containsValue,remove,size,isEmpty
		
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		
		//add element in map-O(1)
		hm.put("Ambuj", 25);
		hm.put("Praneel", 30);
		hm.put("Dilip", 28);
		hm.put("Pradhan", 21);
		hm.put("Sai", 35);
		
		System.out.println(hm);//HashMap is inordered collection of data
		
		
		//get(key) operation-O(1)-returns corresponding value of key
		int age=hm.get("Dilip");//key is case sensitive
		System.out.println(age);
		
		//containsKey(key), return true/false->a/c key exist or not->>>>O(1)
		System.out.println(hm.containsKey("Ambuj"));
		System.out.println(hm.containsKey("Sharma"));
		
		
		//containsValue(value), return true/false->a/c value exist or not->>>>>O(1)
		System.out.println(hm.containsValue(35));
		System.out.println(hm.containsValue(55));
		
		
		//remove(key),removes key and corresponding value,returns removed value->>>>>O(1)
		
		System.out.println(hm.remove("Ambuj"));
		
		hm.remove("Dilip", 28);//remove(key,value) both fun can be used
		System.out.println(hm);
		
		
		//size() function (GIVES SIze of map)->>>O(1)
		System.out.println(hm.size());
		
		//isEmpty() function , returns true/false based on map is empty or not--->>>>O(1)
		
		System.out.println(hm.isEmpty());
		
		//clear() function,removes all entries of map->>>O(1)
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
