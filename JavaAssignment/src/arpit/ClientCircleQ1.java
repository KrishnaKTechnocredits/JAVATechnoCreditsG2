package arpit;

import java.util.Scanner;

public class ClientCircleQ1 {

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");

		// Take value of radius from user
		float radius = sc.nextFloat();

		// Creating object of the class
		CircleQ1 circle = new CircleQ1();

		// To call the setRadius method and provide value of radius which is
		// given by user.
		circle.setRadius(radius);

		// Call method to perform the operation
		circle.calculateAreaAndCircumference();

		sc.close();

	}

}
