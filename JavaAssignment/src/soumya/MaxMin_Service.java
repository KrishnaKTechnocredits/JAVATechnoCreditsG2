package soumya;

import java.util.Scanner;

public class MaxMin_Service {
	int arr[];
	int size, max, min;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in an array: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter array for finding maximum and minimum number: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		sc.close();
	}

	// Method for finding maximum and minimum number in array
	void maxMin() {
		max = arr[0];
		min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				max = arr[index];
			}
			if (arr[index] < min) {
				min = arr[index];
			}
		}
		System.out.println("Largest Number in given array is:" + max);
		System.out.println("Smallest Number in given array is:" + min);
	}
}
