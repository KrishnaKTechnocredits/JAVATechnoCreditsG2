package soumya;

import java.util.Scanner;

public class PrimeNumber_Service {
	static boolean flag;
	static int sum, fr, lr;

	// Method for getting input from user
	static void scannerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		fr = sc.nextInt();
		System.out.print("Enter Second Number: ");
		lr = sc.nextInt();
	}

	void getRange() {
		for (int i = fr; i < lr; i++) {
			boolean flag = isPrime(i);
			if (flag == true) {
				System.out.println(i + " is Prime Number");
				sum = sum + i;
			}
		}
		System.out.println("Sum is: " + sum);
	}

	static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return flag;
	}
}
