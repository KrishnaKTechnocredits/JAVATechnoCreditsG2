package monali;

import java.util.Scanner;

public class TwoNoTernaryOp {
	void twoTernaryOp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();
		double result = (num1 > num2) ? num1 : num2;
		System.out.println("Number is greater: " + result);

	}

	public static void main(String[] args) {
		TwoNoTernaryOp to = new TwoNoTernaryOp();
		to.twoTernaryOp();

	}

}
