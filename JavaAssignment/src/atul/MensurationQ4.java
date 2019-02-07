//WAP to find the Area and Perimeter of Rectangle & Circle
package atul;

public class MensurationQ4 {

	// Defining pi value for calculation of circles area and Perimeter.
	static Double pi = 3.14;

	// This function returns the area of rectangle
	int calculateAreaOfRectangle(int length, int breadth) {
		return length * breadth;
	}

	// This function returns the Perimeter of rectangle
	int calcluatePerimeterOfRectangle(int length, int breadth) {
		return 2 * (length + breadth);
	}

	// This function returns the area of circle
	double calculateAreaOfCircle(int radius) {
		return pi * radius * radius;
	}

	// This function returns the Perimeter of circle
	double calcluatePerimeterOfCircle(int radius) {
		return 2 * pi * radius;
	}

	public static void main(String[] args) {
		// creating the object
		MensurationQ4 obj = new MensurationQ4();
		// converting the string argument(length) to integer
		int length = Integer.parseInt(args[0]);
		// converting the string argument(breadth) to integer
		int breadth = Integer.parseInt(args[1]);
		// converting the string argument(radius) to integer
		int radius = Integer.parseInt(args[2]);
		// Printing the Area of Rectangle
		System.out.println("Area of Rectangle with length " + length + " and breadth " + breadth + " is : "
				+ obj.calculateAreaOfRectangle(length, breadth));
		// Printing the Perimeter of Rectangle
		System.out.println("Perimeter of Rectangle with length " + length + " and breadth " + breadth + " is : "
				+ obj.calcluatePerimeterOfRectangle(length, breadth));
		// Printing the Area of Circle
		System.out.println("Area of Circle with radius " + radius + " is : " + obj.calculateAreaOfCircle(radius));
		// Printing the Perimeter of Circle
		System.out.println(
				"Perimeter of Circle with radius " + radius + " is : " + obj.calcluatePerimeterOfCircle(radius));
	}
}
