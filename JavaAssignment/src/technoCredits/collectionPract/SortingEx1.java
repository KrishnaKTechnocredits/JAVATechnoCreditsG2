package technoCredits.collectionPract;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(9);
		numbers.add(17);
		numbers.add(13);
		
		Collections.sort(numbers);
		System.out.println(numbers);
	}
}
