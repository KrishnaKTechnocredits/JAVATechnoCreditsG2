package purva;

import java.util.Scanner;

public class SwapNoTemp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println("\nNumbers before swapping are: " + num1 + " " + num2);
		swap(num1, num2);
		sc.close();

	}

	static void swap(int n1, int n2) {
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("\nNumbers before swapping are: " + n1 + " " + n2);
	}
}
