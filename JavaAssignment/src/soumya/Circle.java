package soumya;

public class Circle {
	float radius;

	// Method for initializing radius
	float radius(float r) {
		radius = r;
		return radius;
	}

	// Method for calculating area
	void area(float radius) {
		System.out.println("Area of circle is: " + (3.14 * radius * radius));
	}// Method for calculating circumference

	void circumference(float radius) {
		System.out.println("Circumference of circle is: " + (2 * 3.14 * radius));
	}
}
