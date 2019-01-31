/*Check if array contains a number in Java. 
 * Hint: Your method should accept 2 parameters. Input array and number.
i/p :- arr[] = {2,5,9,7,4,6}
number :- 8
o/p :- number is not in arr.*/

package purva;

import java.util.Scanner;

public class PurvaAssignment2Q3 {
	public static void main(String[] args) {
		InputOutput iop = new InputOutput();
		int[] arr = iop.inputIntArray();
		System.out.println("Enter number which we need to check in array: ");
		Scanner sc1 = new Scanner(System.in);
		int no = sc1.nextInt();
		PurvaAssignment2Q3 nchk = new PurvaAssignment2Q3();
		nchk.printInputValuesOnscreen(arr, no);
		boolean flag = nchk.nocheck(arr, no);
		sc1.close();
		if (flag == false)
			System.out.println("\n" + "o/p :- number is not in arr");
		else  
		System.out.println("\n" + "o/p :- number is in arr");
		
	}

	/*
	 * This method will print the input array and number is format specified in
	 * assignment
	 */
	void printInputValuesOnscreen(int[] ar, int n) {
		System.out.print("\n" + "i/p :- ar[] = {");
		for (int index = 0; index < ar.length; index++) {
			if (index < ar.length - 1)
				System.out.print(ar[index] + ",");
			else if (index < ar.length)
				System.out.print(ar[index]);
		}
		System.out.println("}");
		System.out.println("number :- " + n);
	}

	/*
	 * This method is taking input as array and a number and checking if the
	 * number is present in the array. It return a boolean flag as false if the
	 * number is not present.
	 */
	boolean nocheck(int[] a, int no) {
		boolean flag = true;
		for (int counter = 0; counter < a.length; counter++) {
			if (a[counter] == no)
			{
				flag = true;
				break;
			}
			else 
				flag = false;		
		}
		return flag;
	}
}
