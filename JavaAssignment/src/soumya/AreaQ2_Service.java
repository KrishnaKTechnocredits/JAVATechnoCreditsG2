package soumya;

public class AreaQ2_Service {
	// Method for calculating area of square
	int area(int side1, int side2) {
		int area = side1 * side2;
		return area;
	}

	// Method for calculating area of rectangle
	float area(float length, float breadth) {
		float area = length * breadth;
		return area;
	}

	// Method for calculating area of circle
	double area(double radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
}
