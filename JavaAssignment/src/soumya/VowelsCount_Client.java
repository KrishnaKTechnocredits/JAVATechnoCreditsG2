/*
 * This program will find vowels in given string
 */
package soumya;

import java.util.Scanner;

public class VowelsCount_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		sc.close();
		VowelsCount_Service vowel = new VowelsCount_Service();
		int count = vowel.checkVowel(str);
		System.out.println(count);
	}
}
