//Q7

package array_string_programs;

import java.util.Scanner;

public class Factorial {

	void factorial(int num) {

		int ans = 1;
		while (num > 0) {
			ans = ans * num;
			num--;
		}

		System.out.println("Factorial of  number is " + ans);
	}

	public static void main(String[] args) {
		System.out.println("Enter an number to find factorial");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Factorial fn = new Factorial();
		fn.factorial(num);
		sc.close();
	}

}
