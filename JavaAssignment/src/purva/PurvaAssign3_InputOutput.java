/*This program takes array input from user and displays those array values*/

package purva;

import java.util.Scanner;

public class PurvaAssign3_InputOutput {
	
	/* This method taken array values of type Integer */
	
	int[] inputIntArray() {
		System.out.println("Enter the total numbers you want to enter in array = ");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();
		int[] numarr = new int[size];
		System.out.println("Enter the array values:");
		for (int index = 0; index < size; index++) {
			Scanner sc2 = new Scanner(System.in);
			numarr[index] = sc2.nextInt();
		}
		return numarr;
	}
	
	/* This method displays the array values entered by user */
	void display(int[] a) {
		System.out.println("Array values entered by user is: ");
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + "\t");
		}
	}

 	/*
	 * This is main method which calls 2 methods to take array input of type
	 * integer and display the array values
	 */
	public static void main(String[] args) {
		PurvaAssign3_InputOutput iop = new PurvaAssign3_InputOutput();
		int[] ms_arr = iop.inputIntArray();
		iop.display(ms_arr);
	}

}
