package monali;

import java.util.Scanner;

public class LargestNumberLogicalAnd {

	void largestNoAnd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		sc.close();

		if (num1 > num2 && num1 > num3)
			System.out.println("First number is Largest : " + num1);
		else if (num2 > num1 && num2 > num3)
			System.out.println("Second number is Largest: " + num2);
		else if (num3 > num1 && num3 > num2)
			System.out.println("Third number is Largest : " + num3);
		else
			System.out.println("Entered numbers not valid");

	}

	public static void main(String[] args) {
		LargestNumberLogicalAnd ln = new LargestNumberLogicalAnd();
		ln.largestNoAnd();
	}

}
