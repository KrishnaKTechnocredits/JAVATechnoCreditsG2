//Q11

package array_string_programs;

import java.util.Scanner;

public class PalindromeNum {
	void findPalidromeNumber(int num) {

		int original = num;
		int reverse = 0;
		while (num > 0) {
			int reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;
		}

		if (original == reverse) {
			System.out.println("Given number is palidrome");
		} else {
			System.out.println("Given number is not palidrome");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PalindromeNum pnum = new PalindromeNum();
		pnum.findPalidromeNumber(num);
		sc.close();
	}

}
