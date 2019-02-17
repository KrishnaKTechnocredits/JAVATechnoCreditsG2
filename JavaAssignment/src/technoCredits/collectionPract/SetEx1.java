package technoCredits.collectionPract;

import java.util.HashSet;
import java.util.LinkedHashSet;

// Set interface does not allow duplicate value.
// HashSet does not allow duplicate value as well not maintain the insertion order.
// HashSet calculate the HashCode of every insertion, and set value accordingly.
// LinkedHashSet maintain insertion order and does not allow duplicate value.
// TreeSet allows natural ordering without duplicate value.
public class SetEx1 {

	public static void main(String[] args) {
		SetEx1 s1 = new SetEx1();
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ravi");
		hs.add("Arpit");
		hs.add("Maulik");
		hs.add("Purva");
		hs.add("Arpit");
		System.out.println("hs: "+hs+"  hs size: "+hs.size());
		
		HashSet<Integer> hs1 = new 	HashSet<Integer>();
		int[] arrayInt = {12,14,12,15,16,19,12};
		
		for(int i=0; i<arrayInt.length ; i++)
			hs1.add(arrayInt[i]);
		
		System.out.println("Unique array from HashSet: "+hs1);
		
	
		LinkedHashSet<Integer> hs2 = new LinkedHashSet<Integer>();
		int[] arrayInt2 = {12,14,12,15,16,19,12};
		
		for(int i=0; i<arrayInt2.length ; i++)
			hs2.add(arrayInt2[i]);
		
		System.out.println("Unique array from LinkedHashSet: "+hs2);
		
	}
}
