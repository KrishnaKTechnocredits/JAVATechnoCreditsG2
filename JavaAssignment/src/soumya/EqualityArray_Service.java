package soumya;

import java.util.Scanner;

public class EqualityArray_Service {
	int arr[];
	int arr1[];

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number for Elements: ");
		int tNo = sc.nextInt();
		arr = new int[tNo];
		arr1 = new int[tNo];
		System.out.println("Enter Elements in Array One: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		System.out.println("Enter Elements in Array Two: ");
		for (int index1 = 0; index1 < arr1.length; index1++) {
			arr1[index1] = sc.nextInt();
		}
		sc.close();
	}

	// Method for comparing two arrays
	void eqArray() {
		boolean flag = false;
		System.out.println("Comparing both arrays:");
		for (int count = 0; count < arr.length; count++) {
			if (arr[count] == arr1[count]) {
				flag = true;
			} else {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not Equal");
		}
	}
}
