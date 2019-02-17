package technoCredits.collectionPract;

import java.util.ArrayList;

public class ArrayListEx4 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(20);
		al1.add(233);
		al1.add(22);
		al1.add(232);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(230);
		al2.add(231);
		al2.add(232);
		al2.add(233);
		
		al1.retainAll(al2);
		System.out.println(al1);
		
//		al1.addAll(al2);
//		System.out.println("al1: "+al1);
//		System.out.println("al2: "+al2);
//		al1.removeAll(al2);
//		System.out.println("al1: "+al1);
	}
}
