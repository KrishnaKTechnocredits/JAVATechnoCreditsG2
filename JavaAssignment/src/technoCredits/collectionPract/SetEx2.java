package technoCredits.collectionPract;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetEx2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Arpit");
		al.add("Maulik");
		al.add("Purva");
		al.add("Arpit");
		System.out.println("al: "+al+"  al size: "+al.size());
		
		HashSet<String> hs = new HashSet<String>(al);
		
//		for(int i=0; i<al.size(); i++)
//			hs.add(al.get(i));
//		
		System.out.println("Unique ArrayList: "+hs);
		
		TreeSet<String> ts = new TreeSet<String>(al);
		System.out.println("Unique ArrayList from TreeSet: "+ts);
		
		ArrayList al3 = new ArrayList();
		al3.add("Ravi");
		al3.add(1);
		al3.add('g');
		HashSet ts1 = new HashSet(al3);  // Exception on TreeSet ts1 = new TreeSet(al3);
		System.out.println("ArrayList for various input: "+ts1);
	}

}
