package arpit;

import java.util.Scanner;

public class TestSquareQ4 {

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the side of square: ");

		// Take value of side of square from user
		int side = sc.nextInt();

		// Creating object of the class
		SquareQ4 square = new SquareQ4(side);

		// Call areaOfSquare method to perform operation
		square.areaOfSquare();

		// Call display method to show the area of square value
		square.display();

	}

}
