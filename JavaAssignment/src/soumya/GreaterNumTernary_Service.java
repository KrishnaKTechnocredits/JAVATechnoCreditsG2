package soumya;

import java.util.Scanner;

public class GreaterNumTernary_Service {
	int num1, num2;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for finding greater number: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
	}

	// Method for finding greater number
	void largeNum() {
		String result = num1 > num2 ? num1 + " is greater" : num2 + " is greater";
		System.out.println(result);
	}
}
