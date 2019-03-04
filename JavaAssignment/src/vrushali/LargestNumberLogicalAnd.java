package vrushali;

import java.util.Scanner;

//Program to find largest of three numbers using Logical And Operator
public class LargestNumberLogicalAnd {

	int largestNumber = 0;

	int larestNumberCheck() {
		System.out.println("Enter 3 numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			largestNumber = num1;
			System.out.println("Largest Number is: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			largestNumber = num2;
			System.out.println("Largest Number is: " + num2);
		} else {
			largestNumber = num3;
			System.out.println("Largest Number is: " + num3);
		}
		sc.close();
		return largestNumber;
	}

	public static void main(String[] args) {
		LargestNumberLogicalAnd largestNum = new LargestNumberLogicalAnd();
		largestNum.larestNumberCheck();
	}
}
