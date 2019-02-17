package technoCredits.collectionPract;

import java.util.ArrayList;
import java.util.HashSet;

public class SetEx3 {
	
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.add("Ravi"));
		System.out.println(hs.add("Arpit"));
		System.out.println(hs.add("Maulik"));
		System.out.println(hs.add("Purva"));
		System.out.println(hs.add("Arpit"));
		
		// Enhanced for loop 
		int count =1;
		for(String s:hs){
			if(count==2){
				System.out.println("Value in hs: "+s);
			    break;
			}
			count++;
		}
			System.out.println("count : "+count);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(20);
		al.add(90);
		al.add(45);
		
		for(int i:al)
			System.out.println("Int value: "+i);
		
		int[] arr = new int[5];
		for(int i : arr)
			System.out.println(i);
		
		int[] arrayint = {12, 14, 15, 12, 17, 19, 12, 14};
		HashSet<Integer> hs1 = new HashSet<Integer>();
		for(int i =0; i<arrayint.length ; i++){
			//Boolean flag  = hs1.add(arrayint[i]);
			if(hs1.add(arrayint[i])==false)
				System.out.println("Duplicate number is: "+arrayint[i]);
		}
		
		
	}

}
