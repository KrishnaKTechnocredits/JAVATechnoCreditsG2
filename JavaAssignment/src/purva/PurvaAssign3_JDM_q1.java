/* Find the largest of three numbers using Logical And operator */

package purva;

import java.util.Scanner;

public class PurvaAssign3_JDM_q1 {

	public static void main(String[] args) {
		double[] arr = new double[3];
		System.out.println("Enter numbers from array: ");
		Scanner sc1 = new Scanner(System.in);
		for (int counter = 0; counter < arr.length; counter++) {
			arr[counter] = sc1.nextDouble();
		}
		System.out.println("\n" + "Input Array");
		for (int counter = 0; counter < arr.length; counter++) {
			System.out.print(arr[counter] + "\t");
		}
		sc1.close();
		PurvaAssign3_JDM_q1 obj1 = new PurvaAssign3_JDM_q1();
		double num = obj1.largestNumber(arr);
		System.out.println("\n" + "Largest number from array = " + num);
	}
	
	/* Below function takes returns largest number from input array and returns to main method */

	double largestNumber(double[] a) {
		double max = a[0];
		double no = 0;
		for (int index = 1; index < a.length; index++) {
			if (max > a[index] && max > a[index + 1]) {
				no = max;
				break;
			} else if (a[index] > max && a[index] > a[index + 1]) {
				no = a[index];
				break;
			} else if (a[index + 1] > max && a[index + 1] > a[index]) {
				no = a[index + 1];
				break;
			}
		}
		return no;
	}
}
