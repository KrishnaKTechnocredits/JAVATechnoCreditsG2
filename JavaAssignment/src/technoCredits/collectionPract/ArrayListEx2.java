package technoCredits.collectionPract;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(20);
		System.out.println(al);
		al.add(1, 90);
		al.add(3, 45);
		//al.add(4, 200); // Throw exception
		System.out.println(al);
		//al.remove(20);  // Exception
		al.remove(new Integer(15));
		al.remove(Integer.valueOf(20));
		System.out.println(al);
		
	}

}
