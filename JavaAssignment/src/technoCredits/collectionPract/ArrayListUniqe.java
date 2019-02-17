package technoCredits.collectionPract;

import java.util.ArrayList;

public class ArrayListUniqe {
	
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(19);
		al1.add(12);
		al1.add(13);
		al1.add(15);
		al1.add(77);
		al1.add(15);
		System.out.println("Before al1: "+al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(15);
		al2.add(17);
		al2.add(19);
		al2.add(15);
		
		// To find unique array list
		al1.removeAll(al2);
		System.out.println("After removing al2 in al1: "+al1);
		
		al1.addAll(al2);
		System.out.println("Fianl arrayList: "+al1);
		
	}
	
	

}
