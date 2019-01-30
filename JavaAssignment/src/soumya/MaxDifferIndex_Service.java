package soumya;

import java.util.Scanner;

public class MaxDifferIndex_Service {
	int diff = 0;
	int arrOne[], arrTwo[];
	int size;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in an array: ");
		size = sc.nextInt();
		arrOne = new int[size];
		arrTwo = new int[size];

		System.out.println("Enter elements in first array: ");
		for (int index = 0; index < arrOne.length; index++) {
			arrOne[index] = sc.nextInt();
		}
		System.out.println("Enter elements in second array: ");
		for (int index = 0; index < arrOne.length; index++) {
			arrTwo[index] = sc.nextInt();
		}
		sc.close();
	}

	// Method for comparing two arrays
	void compare() {
		for (int index = 0; index <= arrTwo.length - 1; index++) {
			if (arrOne[index] == arrTwo[index]) {
			} else {
				if (arrOne[index] > arrTwo[index]) {
					System.out.println("Values are not matching at index-> " + index);
					System.out.println(
							"From (" + arrOne[index] + "," + arrTwo[index] + ") max value is " + arrOne[index]);
				} else {
					System.out.println("Values are not matching at index-> " + index);
					System.out.println(
							"From (" + arrOne[index] + "," + arrTwo[index] + ") max value is " + arrTwo[index]);
				}
			}
		}
	}
}
