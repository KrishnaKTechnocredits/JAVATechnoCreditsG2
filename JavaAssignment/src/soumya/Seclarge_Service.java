package soumya;

import java.util.Scanner;

public class Seclarge_Service {
	int max = 0;
	int secMax = 0;
    int arr[];
	int size;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in an array: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter array for finding second maximum number: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		sc.close();
	}

	// Method for finding second maximum number in array
	void secMax() {
		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index] > max) {
				secMax = max;
				max = arr[index];
			} else if (arr[index] > secMax && arr[index] != max) {
				secMax = arr[index];
			}
		}
		if (secMax == 0) {
		} else {
			System.out.println("The second largest element is : " + secMax);
		}
	}
}
