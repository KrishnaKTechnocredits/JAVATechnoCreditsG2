package soumya;

import java.util.Scanner;

public class SumEqual_Service {
	int arr[];
	int sum;
	int size;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in an array:");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter elements in array: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		System.out.println("Enter sum: ");
		sum = sc.nextInt();
		sc.close();
	}

	// Method for checking sum
	void sumCheck() {
		System.out.println("Integer numbers, whose sum is equal to value:" + sum);
		for (int index1 = 0; index1 < arr.length; index1++) {
			for (int index2 = index1 + 1; index2 < arr.length; index2++) {
				if (arr[index1] + arr[index2] == sum) {
					System.out.println("(" + arr[index1] + "," + arr[index2] + ")");
				}
			}
		}
	}
}
