package arpit;

import java.util.Scanner;

public class TestAreaQ7 {

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Display the menu of all Geometric shape whose area user want to
		// calculate
		System.out.println("Enter the Geometric shapes number whose area user want");
		System.out.println("1-Rectangle, 2-Triangle, 3-Circle");

		// Choose the number by the user to calculate area of that shape
		int shape = sc.nextInt();

		// Creating object of the class
		CalculateAreaQ7 area = new CalculateAreaQ7();

		// To call calculateArea method and provide geometric shape to that
		// method as a input
		area.calculateArea(shape);
		sc.close();

	}

}
