package arpit;

import java.util.Scanner;

public class MaxValueAtDifferIndexQ10 {

	// This function perform operation to find the maximum value at any index
	// where array value differ
	void findMaxValueAtIndex(int[] element1, int[] element2) {

		// Display if length of array is not same
		if (element1.length != element2.length) {
			System.out.println("Araay length is not same");
		} else {

			// Display the maximum value
			for (int index = 0; index < element1.length; index++) {
				if (element1[index] == element2[index]) {
					
				} else if (element1[index] > element2[index]) {
					System.out.println("Array differ at index: " + index + " & max value between "
							+ (element1[index] + " & " + element2[index]) + " is: " + element1[index]);
				} else {
					System.out.println("Array differ at index: " + index + " & max value between "
							+ (element1[index] + " & " + element2[index]) + " is: " + element2[index]);
				}
			}
		}
	}

	// This function return integral type array
	int[] inputForArray1() {
		System.out.println("Number of element in array1: ");

		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int[] num1 = new int[size1];

		// Display elements of array1
		System.out.println("Element of array1 one by one: ");
		for (int index = 0; index < num1.length; index++) {
			System.out.println(num1[index] = sc.nextInt());
		}

		return num1;

	}

	// This function return integral type array
	int[] inputForArray2() {
		System.out.println("Number of element in array2: ");

		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		int size2 = sc.nextInt();
		int[] num2 = new int[size2];

		// Display elements of array2
		System.out.println("Element of array2 one by one: ");
		for (int index = 0; index < num2.length; index++) {
			System.out.println(num2[index] = sc.nextInt());
		}

		return num2;
	}

	public static void main(String[] args) {

		// Creating object of class
		MaxValueAtDifferIndexQ10 maxValueAtIndex = new MaxValueAtDifferIndexQ10();

		// To call the inputForArray1() method an store result in a1
		int[] a1 = maxValueAtIndex.inputForArray1();

		// To call the inputForArray2() method an store result in a2
		int[] a2 = maxValueAtIndex.inputForArray2();

		// To call findMaxValueAtIndex() method and provide input to that method
		maxValueAtIndex.findMaxValueAtIndex(a1, a2);
	}

}
