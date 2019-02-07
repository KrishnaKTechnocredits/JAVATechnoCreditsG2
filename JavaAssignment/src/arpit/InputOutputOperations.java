package arpit;

import java.util.Scanner;

public class InputOutputOperations {

	int[] takeInputFromUser() {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		int[] number = new int[3];

		System.out.println("All 3 number given one by one");

		for (int index = 0; index < number.length; index++) {

			System.out.println(number[index] = sc.nextInt());
		}

		return number;

	}

}
