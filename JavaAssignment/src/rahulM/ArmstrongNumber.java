//Q13

package array_string_programs;

import java.util.Scanner;

public class ArmstrongNumber {
	void findArmStrongNumber(int num) {

		int original = num;
		int result = 0;
		while (num > 0) {
			int rem = num % 10;
			result = result + (rem * rem * rem);
			num = num / 10;
		}

		if (original == result) {
			System.out.println("Given number is Armstrong number");
		} else {
			System.out.println("Given number is not Armstrong number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArmstrongNumber armstrng = new ArmstrongNumber();
		armstrng.findArmStrongNumber(num);
		sc.close();
	}
}
