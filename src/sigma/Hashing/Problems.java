package sigma.Hashing;

import java.util.HashMap;

//problem 1 -->>Majority element problem

public class Problems {
	
	//function for printing freequency of char in given String
	public static void freequency(String str) {
		
		str=str.toLowerCase();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				//map.getOrDefault(ch,0)+1
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch)+1);//increase freequency by 1
				} else {
					map.put(ch, 1);
				}
				
			}
			
			
		}
		
		
		for(Character c:map.keySet()) {
			System.out.println("Character is =" + c + ", freequency is =" + map.get(c));
		}
	}
	
	//function for finding itinerary(journey) from tickets
	public static void itinerary(HashMap<String, String> tickets) {
		
		String start=getStart(tickets);
		
		System.out.print(start);
		
		//now we have to map , start to its value ,then update start as its value
		//iterate on map as no of mapping is no of tickets availble
		for(String key:tickets.keySet()) {//here key has no work, only to iterate on tickets so that total journey can be calculated
			
			start=tickets.get(start);
			System.out.print("->" + start);
		}
		
		
	}
	
	//function for get starting city
	public static String getStart(HashMap<String, String> map ) {
		
		//First of all we will create a another map , in which we will have given map key as value and given map value as key
		//similar to (from,to) ->>(to, from)
		
		//String start="";
		HashMap<String, String> revMap=new HashMap<String, String>();
		for(String key:map.keySet()) {
			revMap.put(map.get(key), key);//now we have (to,from) mapping
		}
		
		//now we have to check , if in tickets map ,key is available as from but not in ( to) then that will be start
		for(String key:map.keySet()) {
			//city avialable in from but now in to ,that is our starting point
			if(!revMap.containsKey(key)) {
				return key;
			}
		}
		
		return null;//only to remove error, counter will neven come here, as one starting point will always exist for a journey that will be founded in tickets itself
	}
	
	public static void main(String[] args) {
		
		HashMap<String, String> tickets=new HashMap<String, String>();
		
		tickets.put("Chennai", "Bengaluru");
		tickets.put("Mumbai", "Delhi");
		tickets.put("Goa", "Chennai");
		tickets.put("Delhi", "Goa");
		
		itinerary(tickets);
		
		//here mapping id (from ,to) based data
		
		
		
		
		
//		String st="Ambuj Kumar";
//		freequency(st);
		
//		//code for majority element
//		int arr[]= {1,3,2,5,1,3,1,5,1};
//		
//		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
//		
//		//idea is store array element as key of map and and it's freequency as value
//		
//		for(int i=0;  i<arr.length;i++) {
//			int num=arr[i];
//			
//			if(map.containsKey(num)) {
//				map.put(num, map.get(num)+1);
//			} else {
//				map.put(num, 1);
//			}
//		}
//		
//		for(Integer key:map.keySet()) {
//			if(map.get(key)>arr.length/3) {
//				System.out.println(key);
//			}
//		}//above algorithm time complexity is O(N)
		
		
		
	}

}
