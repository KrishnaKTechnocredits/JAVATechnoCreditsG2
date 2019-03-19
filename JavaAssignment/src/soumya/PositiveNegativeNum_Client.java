/*
 * This program will find positive and negative number from given array
 */
package soumya;

import java.util.Scanner;

public class PositiveNegativeNum_Client {
	public static void main(String[] args) {
		int arr[];
		PositiveNegativeNum_Service posNeg = new PositiveNegativeNum_Service();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		System.out.println("Enter elements in Array: ");
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		posNeg.positiveNegativeNum(arr);
	}
}
