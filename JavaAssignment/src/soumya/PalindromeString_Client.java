/*
 * This program will check if word is palindrome or not
 */
package soumya;

import java.util.Scanner;

public class PalindromeString_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		sc.close();
		PalindromeString_Service palidromeString = new PalindromeString_Service();
		String result = palidromeString.checkString(str);
		if (str.equals(result)) {
			System.out.println(result + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}
	}
}
