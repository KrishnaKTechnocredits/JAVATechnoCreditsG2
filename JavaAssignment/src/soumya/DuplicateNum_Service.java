package soumya;

import java.util.Scanner;

public class DuplicateNum_Service {
	static int max = 0, size;

	// Method for getting input from user
	static int[] InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number for finding duplicate: ");
		int tNo = sc.nextInt();
		int arr[] = new int[tNo];
		System.out.println("Enter Numbers : ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		for (int index = 0; index < arr.length; index++) {
			if (max < arr[index]) {
				max = arr[index];
			}
		}
		size = max + 1;
		return arr;
	}

	// Method for finding duplicate numbers
	static void dup(int[] arr) {
		int count[] = new int[size];
		for (int i = 0; i < arr.length; i++) {

			if (count[arr[i]] == 1) {
				System.out.println(arr[i] + " is duplicate number");
			} else {

				count[arr[i]]++;
			}
		}
	}
}
