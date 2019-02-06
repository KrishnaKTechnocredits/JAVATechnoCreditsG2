package soumya;

import java.util.Scanner;

public class LargeNumLogical_Service {
	int num1, num2, num3;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers for finding largest number: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
	}

	// Method for finding largest number
	void largeNum() {
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is greater");
		} else if (num3 > num1 && num3 > num1) {
			System.out.println(num3 + " is greater");
		}
	}
}
