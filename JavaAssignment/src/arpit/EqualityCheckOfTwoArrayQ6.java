package arpit;

import java.util.Scanner;

public class EqualityCheckOfTwoArrayQ6 {

	// This function perform the operation to check two arrays contain same
	// element or not and return value.
	boolean CheckElementsOfArrays(int[] element1, int[] element2) {

		if (element1.length != element2.length) {
			System.out.println("Array length is not same");
			return false;
		}
		for (int index = 0; index < element1.length; index++) {
			if (element1[index] != element2[index])
				return false;
		}
		return true;
	}

	// This function return integral type Array
	int[] inputForArray1() {
		System.out.println("Number of element in array1: ");

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int[] num1 = new int[size1];

		// Display elements of Array1
		System.out.println("Element of array1 one by one: ");
		for (int index = 0; index < num1.length; index++) {
			System.out.println(num1[index] = sc.nextInt());
		}

		return num1;

	}

	// This function return integral type Array
	int[] inputForArray2() {
		System.out.println("Number of element in array2: ");

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		int size2 = sc.nextInt();
		int[] num2 = new int[size2];

		// Display elements of Array2
		System.out.println("Element of array2 one by one: ");
		for (int index = 0; index < num2.length; index++) {
			System.out.println(num2[index] = sc.nextInt());
		}

		return num2;
	}

	public static void main(String[] args) {

		// Creating object of the class
		EqualityCheckOfTwoArrayQ6 equalityCheck = new EqualityCheckOfTwoArrayQ6();

		// To call the inputForArray1 method and store result in "a1"
		int[] a1 = equalityCheck.inputForArray1();

		// To call the inputForArray2 method and store result in "a2".
		int[] a2 = equalityCheck.inputForArray2();

		// To call the CheckElementsOfArrays method and provide input to that
		// method.
		boolean result = equalityCheck.CheckElementsOfArrays(a1, a2);

		// Display the result of Equality check
		System.out.println("All elements of both array is Equal: " + result);

	}

}
