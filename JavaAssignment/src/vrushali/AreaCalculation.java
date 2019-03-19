package vrushali;

import java.util.Scanner;

public class AreaCalculation {

	public static void main(String args[]) {
		int shape = 0;
		do {
			System.out.println("Enter your choice:");
			System.out.println("1. Rectangle");
			System.out.println("2. Triangle");
			System.out.println("3. Circle");
			System.out.println("4. Exit");
			Scanner sc = new Scanner(System.in);
			shape = sc.nextInt();
			AreaCalculation choice = new AreaCalculation();

			switch (shape) {
			case 1:
				choice.Reactangle();
				break;
			case 2:
				choice.Triangle();
				break;
			case 3:
				choice.Circle();
				break;
			case 4:
				System.out.println("Exited from the program");
				System.exit(0);

			default:

				System.out.println("Invalid choice ");
				System.out.println("Do you want to continue operation(Y/N): ");
				char c = (char) sc.nextInt();
				if (c == 'y' || c == 'Y') {
					continue;
				} else {

					System.out.println("Exited from the program");
					System.exit(0);
				}

			}

		} while (shape != '4');
	}

	public static void Reactangle() {
		int areaR, length, breadth;
		System.out.println("Enter length and breadth of rectangle");
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		breadth = sc.nextInt();
		areaR = length * breadth;
		System.out.println("Area of Rectangle: " + areaR);

	}

	public static double Triangle() {
		double base, height;
		double areaT;
		System.out.println("Enter base and height of Triangle");
		Scanner sc = new Scanner(System.in);
		base = sc.nextDouble();
		height = sc.nextDouble();
		areaT = base * height / 2;

		System.out.println("Area of Triangle: " + areaT);
		return areaT;
	}

	public static double Circle() {
		double pi = 3.14;
		double areaOfCircle;
		// int radius;
		System.out.println("Enter radius to calculate area of circle");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		areaOfCircle = pi * radius * radius;
		System.out.println("Area of Circle is: " + areaOfCircle);

		return areaOfCircle;

	}
}
