//Q5

package array_string_programs;

import java.util.Scanner;

public class Reverse_element {

	void reverseNumber(int num) {
		int reverse = 0;
		while (num > 0) {

			int reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;

		}

		System.out.println("Reverse Number  is " + reverse);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to be reversed");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Reverse_element rn = new Reverse_element();
		rn.reverseNumber(num);
		sc.close();
	}

}
