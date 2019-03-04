/*
 * This program will find sum of two array
 */
package soumya;

import java.util.Scanner;

public class ArraySum_Client {
	public static void main(String[] args) {
		int arr1[] = null, arr2[] = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array: ");
		int size1 = sc.nextInt();
		System.out.println("Enter size of second array: ");
		int size2 = sc.nextInt();
		arr1 = new int[size1];
		arr2 = new int[size2];
		System.out.println("Enter elements in first array: ");
		for (int index = 0; index <= arr1.length - 1; index++) {
			arr1[index] = sc.nextInt();
		}
		System.out.println("Enter elements in second array: ");
		for (int index = 0; index <= arr2.length - 1; index++) {
			arr2[index] = sc.nextInt();
		}
		sc.close();
		ArraySum_Service sumArray = new ArraySum_Service();
		int sum = sumArray.sum(arr1, arr2);
		System.out.println("Sum of two array is: " + sum);
	}
}
