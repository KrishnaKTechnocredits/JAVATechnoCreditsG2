/* Below program will find all pairs on integer array whose sum is equal to given number
 * Hint: You have given an integer array and a number, you need to write a program to find all elements in the array whose sum is equal to the given number. Remember, the array may contain both positive and negative numbers, so your solution should consider that. 
 * Input:2, 4, 3, 5, 7, 8, 9 
 * Given sum:7 
 * Integer numbers, whose sum is equal to value:7 
 * (2, 5) 
 * (4, 3) 
 *  */

package purva;

import java.util.Scanner;

public class PurvaAssignment2Q7 {
	public static void main(String[] args) {
		InputOutput iop = new InputOutput();
		int[] arr = iop.inputIntArray();
		System.out.println("\n" + "Enter number for which you need to find matching pairs of numbers from array");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		PurvaAssignment2Q7 obj1 = new PurvaAssignment2Q7();
		obj1.printInput(arr);
		System.out.println("\n" + "Given sum:" + no);
		System.out.println("\n" + "Integer numbers, whose sum is equal to value:" + no);
		boolean flag = obj1.matchPair(arr,no);
		if (flag == false)
			System.out.println("Sorry!! No matching pair found in given array whose sum = 7");
		sc.close();
	}

	/* Below method will check sum of pair equal to value input by user */

	boolean matchPair(int[] a,int n) {
		boolean flag = false;
		int index = 0, count = 0;
		for (index = 0; index < a.length; index++) {
			for (count = index + 1; count < a.length; count++) {
				if (a[index] >= 0 && a[count] >= 0) {
					if ((a[index] + a[count]) == n)
						System.out.println("(" + a[index] + "," + a[count] + ")");
					flag = true;
				}
				else if (a[index] >= 0 && a[count] <= 0) {
					if ((a[index] + a[count]) == n)
						System.out.println("(" + a[index] + "," + a[count] + ")");
					flag = true;
				} else if (a[index] <= 0 && a[count] >= 0) {
					if ((a[index] + a[count]) == n)
						System.out.println("(" + a[index] + "," + a[count] + ")");
					flag = true;
				} else if (a[index] <= 0 && a[count] <= 0) {
					if ((a[index] + a[count]) == n)
						System.out.println("(" + a[index] + "," + a[count] + ")");
					flag = true;
				}
			}

		}
		return flag;
	}

	/* Below program will print input Array in format specified in assignment */
	void printInput(int[] ar) {
		System.out.print("\n" + "Input:");
		for (int index = 0; index < ar.length; index++) {
			if (index < ar.length - 1)
				System.out.print(ar[index] + ",");
			else if (index < ar.length)
				System.out.print(ar[index]);
		}

	}
}
