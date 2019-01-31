package monali;

import java.util.Scanner;

public class InputOutputArrayInt {
	int[] takeInputFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of elements: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter input numbers: ");

		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		return arr;

	}

}
