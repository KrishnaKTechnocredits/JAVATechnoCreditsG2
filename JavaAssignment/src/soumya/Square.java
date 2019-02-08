package soumya;

public class Square {
	double side;

	// Parameterized Constructor
	Square(double side) {
		this.side = side;
	}

	// Method for calculating area
	void calculateArea() {
		System.out.println("Area of square is: " + (side * side));
	}
}
