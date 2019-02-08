package arpit;

import java.util.Scanner;

public class InputOutputOperations {

	// This function return integral type Array
	int[] takeInputFromUser() {

		System.out.println("Number of element in array: ");

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] num = new int[size];

		// Display element of Array
		System.out.println("Element of array one by one: ");

		for (int index = 0; index < num.length; index++) {

			System.out.println(num[index] = sc.nextInt());
		}

		return num;
	}

	// This function return integer value
	int takeIntegerInputFromUser() {

		System.out.println("Number is given by the user to check: ");

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		return number;
	}

}
