package monali;

import java.util.Scanner;

public class AreaSwitch {

	static void areaSwitch() {
		double Area = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation user want to perform: ");
		String choice = sc.next();
		switch (choice) {
		case "rectangle":
			System.out.println("Enter length and breadth: ");
			double length = sc.nextDouble();
			double breadth = sc.nextDouble();
			Area = length * breadth;
			System.out.println("Area of rectangle is: " + Area);
			break;
		case "traingle":
			System.out.println("Enter base and height : ");
			double base = sc.nextDouble();
			double height = sc.nextDouble();
			Area = 1 / 2 * base * height;
			System.out.println("Area of rectangle is: " + Area);
			break;
		case "circle":
			System.out.println("Enter radius : ");
			double radius = sc.nextDouble();
			Area = 3.14 * radius * radius;
			System.out.println("Area of radius is: " + Area);
			break;

		default:
			System.out.println("Invalid choice");
			sc.close();
		}

	}

	public static void main(String[] args) {
		areaSwitch();
	}
}
