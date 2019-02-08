package arpit;

import java.util.Scanner;

public class CalculateAreaQ7 {

	// Instance variable of double type is initialize with zero
	double area = 0;

	// Creating object of Scanner class
	Scanner sc = new Scanner(System.in);

	void calculateArea(int shape) {

		switch (shape) {

		case 1:
			rectangleArea();
			break;

		case 2:
			triangleArea();
			break;

		case 3:
			circleArea();
			break;

		default:
			System.out.println("invalid shape");

		}
	}

	// This function take the length and breadth from user and calculate the
	// area of rectangle
	void rectangleArea() {

		System.out.println("Enter the length of rectangle: ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		int breadth = sc.nextInt();
		area = (length * breadth);
		System.out.println("Area of rectangle is: " + area);
	}

	// This function take base and height from user and calculate the area of
	// the triangle
	void triangleArea() {

		System.out.println("Enter the base of triangle: ");
		int base = sc.nextInt();
		System.out.println("Enter the height of triangle: ");
		int height = sc.nextInt();
		area = (base * height) / 2;
		System.out.println("Area of Triangle is: " + area);
	}

	// This function take radius from user and calculate area of the circle
	void circleArea() {

		System.out.println("Enter the radius of circle: ");
		int radius = sc.nextInt();
		area = (3.14 * radius * radius);
		System.out.println("Area of Circle is: " + area);
	}

}
