package soumya;

import java.util.Scanner;

public class Area_Service {
	double length, breadth, base, height, radius, area;
	int choice;

	// Method for calculating area
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("Press 1 : Area of Rectangle");
		System.out.println("Press 2 : Area of Traingle");
		System.out.println("Press 3 : Area of Circle");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter length and breadth: ");
			length = sc.nextDouble();
			breadth = sc.nextDouble();
			System.out.println("Area of rectangle is: " + (length * breadth));
			break;
		case 2:
			System.out.println("Enter base and height: ");
			base = sc.nextDouble();
			height = sc.nextDouble();
			System.out.println("Area of triangle is: " + ((base * height) * 1 / 2));
			break;
		case 3:
			System.out.println("Enter radius: ");
			radius = sc.nextDouble();
			System.out.println("Area of Circle is: " + (3.14 * (radius * radius)));
			break;
		default:
			System.out.println("Choice not found");
			break;
		}
		sc.close();
	}
}
