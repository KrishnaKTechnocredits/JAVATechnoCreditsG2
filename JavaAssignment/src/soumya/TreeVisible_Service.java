package soumya;

import java.util.Scanner;

public class TreeVisible_Service {
	static int temp = 0;
	static int count = 0;

	// Method for getting input from user
	static int[] InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number for trees : ");
		int tNo = sc.nextInt();
		int arr[] = new int[tNo];
		System.out.println("Enter value of trees : ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		return arr;
	}

	// Method for finding visible trees
	static void treeVisible(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (temp <= a[i]) {
				temp = a[i];
				System.out.println(a[i] + ": Tree is visible");
				count++;
			} else {
				System.out.println(a[i] + ": Tree is not visible");
			}
		}
		System.out.println("Count of Visible Tree is : " + count);
	}
}
