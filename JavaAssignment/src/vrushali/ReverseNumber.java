package vrushali;

import java.util.Scanner;

/**
 * Question No.5 WAP to reveres user given number a. Input number:- 456789 b.
 * Output number :- 987654
 */

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 456789;
		ReverseNumber revNum = new ReverseNumber();
		int ans = revNum.reverseNumber(num);
		revNum.display(ans);
	}

	// Method to reverse user given number
	int reverseNumber(int num) {
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	// Method to display reverse number
	void display(int num1) {
		System.out.println("Reverse number is: " + num1);
	}
}
