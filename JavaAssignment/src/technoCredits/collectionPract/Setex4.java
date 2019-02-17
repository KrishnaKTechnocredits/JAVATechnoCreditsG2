package technoCredits.collectionPract;

import java.util.HashMap;

public class Setex4 {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(9, "India");
		hm.put(2, "UK"); 
		hm.put(3, "US");
		System.out.println(hm);
		System.out.println(hm.put(2, "AUS"));
		hm.put(4, "India");
		System.out.println(hm.put(2, "London"));
		System.out.println(hm);
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("India"));
		System.out.println(hm.get(9));
		System.out.println(hm.get(19));
		System.out.println("size: "+hm.size());
		
	}

}
