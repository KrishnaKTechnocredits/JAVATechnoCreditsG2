package technoCredits.collectionPract;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListValueFromScannerClass {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write 'Quite' to END");
		String temp = sc.next();
		do {
			al.add(temp);
			temp = sc.next();
		} while (!temp.equals("Quite"));
		System.out.println(al);
	}
}
