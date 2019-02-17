package technoCredits;

import java.util.Scanner;

public class ExceptionIntArray {

	public static void main(String[] args) {
		int count = 0;
		int[] output = new int[5];
		while (count < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter valid input");
			try {
				output[count] = sc.nextInt();
				count++;
			} catch (Exception e) {
			}
		}
		display(output);
	}

	static void display(int[] output) {
		for (int j = 0; j < output.length; j++) {
			System.out.println(output[j]);
		}
	}

}
