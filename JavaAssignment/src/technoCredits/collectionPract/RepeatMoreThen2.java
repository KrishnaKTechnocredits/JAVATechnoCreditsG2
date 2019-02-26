package technoCredits.collectionPract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class RepeatMoreThen2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(3);
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int number : al)
		{
			
			if(hm.containsKey(number)){
				hm.put(number, hm.get(number)+1);
			}else{
				hm.put(number, 1);
			}
		}
		System.out.println(hm);
		Set<Integer> s = hm.keySet();
		System.out.println("Keys " + s);
		for(int key : s)
		{
			if(hm.get(key) > 2)
			{
				System.out.println(key + ":" + hm.get(key));
			}
		}
		
		
		/*HashSet<Integer> hs = new HashSet<Integer>(al);
		System.out.println(hs);
		
		ArrayList<Integer> al3 = new ArrayList<Integer>(hs);
		System.out.println(al3);
		
		System.out.println(al);
		
		for(int i =0;i<al3.size();i++)
		{
			int size = al.size();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(al3.get(i));
			
			al.removeAll(temp);
			if(size - al.size() > 2)
			{
				System.out.println(al3.get(i));
			}
		}
				
		*/
		
	
		
	}
}
