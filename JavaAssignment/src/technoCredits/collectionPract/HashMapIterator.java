package technoCredits.collectionPract;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIterator {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("m4", "Akshay");
		hm.put("m2", "Maulik");
		hm.put("m3", "Hardik");
		hm.put("m1", "Harsh");
		hm.put("m5", "Krishna");
		hm.put("m6", "Dhara");
		
		Set<String> s= hm.keySet();
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*for(String str : s)
		{
			System.out.println(str);
		}*/
			
		/*Set<String> s =  hs.keySet();
		for(String temp : s)
		{
			 System.out.println(temp + ":" + hs.get(temp));
		}
		*/
		
		
		
		
		
		
		
		/*Set set = hs.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}
}
