package technoCredits.collectionPract;

import java.util.HashMap;

public class HashMapExa1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Krishna");
		if(!hm.containsKey(1))
			hm.put(1, "MAulik");
			
		System.out.println(hm);
	}

}
