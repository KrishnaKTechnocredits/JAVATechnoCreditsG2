/*
 * This program will find if number is palindrome or not
 */
package soumya;

import java.util.Scanner;

public class PalindromeNum_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		sc.close();
		PalindromeNum_Service palidrome = new PalindromeNum_Service();
		palidrome.palindrome(num);
	}
}
