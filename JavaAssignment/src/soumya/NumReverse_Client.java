/*
 * This program will reverse given number
 */
package soumya;

import java.util.Scanner;

public class NumReverse_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		sc.close();
		NumReverse_Service sumobj = new NumReverse_Service();
		sumobj.numRev(num);
	}
}
