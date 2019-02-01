package soumya;

import java.util.Scanner;

public class MissingNumber_Service {
	int arr[];
	int diff;
	int size, max;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in an array: ");
		size = sc.nextInt();
		arr = new int[size];

		System.out.println("Enter elements in array: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		sc.close();
	}

	// Method for finding missing number
	void missingNum() {
		for (int index = 0; index < arr.length - 1; index++) {
			diff = arr[index + 1] - arr[index];
		}
		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index + 1] - arr[index] == diff) {
			} else {
				int n = arr[index] + diff;
				System.out.println("Missing Number is: " + n);
			}
		}
	}
}
