package purva;

import java.util.Scanner;

public class SumPrimeNos {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum range value for prime number check: ");
		int min_range = sc.nextInt();
		System.out.println("Enter the maximum range value for prime number check: ");
		int max_range = sc.nextInt();
		for (int i = min_range; i <= max_range; i++) {
			boolean flag = primechk(i);
			if (flag == true) {
				sum = sum + i;
			}
		}
		sc.close();
		System.out.println("\n" + "Sum of prime numbers from " + min_range + " " + "to " + max_range + " = " + sum);
	}

	static boolean primechk(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

}
