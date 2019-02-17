package technoCredits.collectionPract;

import java.util.ArrayList;

public class ArrayListEx5 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(19);
		al1.add(12);
		al1.add(13);
		al1.add(15);
		al1.add(77);
		
		ArrayList<Integer> al3 =  new ArrayList<Integer>(al1);
		ArrayList<Integer> al4 =  new ArrayList<Integer>();
		System.out.println("Before al1: "+al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(15);
		al2.add(17);
		al2.add(19);
	
		al4.addAll(al1);
		System.out.println(al4);
		
		al1.removeAll(al2);
		System.out.println(al1);
		
		al2.removeAll(al3);
		System.out.println(al2);
		
		al1.addAll(al2);
		System.out.println(al1);
	}

}
