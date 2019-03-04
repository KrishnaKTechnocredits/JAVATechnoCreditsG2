package swapnali;
import java.util.Scanner;

public class Q1_LargestThreeNumbers {
	public static void main(String[] args) {
		Q1_LargestThreeNumbers largestThreeNumbers = new Q1_LargestThreeNumbers();
		largestThreeNumbers.printLargestOfThreeNumbers();
	}

	void printLargestOfThreeNumbers()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		scanner.close();

		if (num1 > num2 && num1 > num3) {
			System.out.println("First number is largest.");
		}
		else if (num2 > num3) {
			System.out.println("Second number is largest.");
		}
		else if (num3 > num2) {
			System.out.println("Third number is largest.");
		}

	}

	
}
