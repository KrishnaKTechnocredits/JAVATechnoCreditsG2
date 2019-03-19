/*
 * This program will find sum of user given number
 */
package soumya;

import java.util.Scanner;

public class SumNum_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		sc.close();
		SumNum_Service sumobj = new SumNum_Service();
		int sum = sumobj.sum(num);
		System.out.println("Sum of given number:- " + sum);
	}
}
