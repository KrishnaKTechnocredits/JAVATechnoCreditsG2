package soumya;

import java.util.Scanner;

public class CheckNo_Service {
	int arr[];
	int num;
	int size;

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
		System.out.println("Enter number to search: ");
		num = sc.nextInt();
		sc.close();
	}

	// Method for searching number
	void numSearch() {
		boolean flag = false;
		for (int index = 0; index < arr.length; index++) {
			if (num == arr[index]) {
			}
		}
		if (flag == true) {
			System.out.println("Number is in arr");
		} else {
			System.out.println("Number is not in arr");
		}
	}
}
