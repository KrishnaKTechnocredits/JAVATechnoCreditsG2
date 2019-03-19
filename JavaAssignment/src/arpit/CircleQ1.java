package arpit;

public class CircleQ1 {

	float radius;

	public float getRadius() {
		return radius;
	}

	// This function take the radius from user.
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// This function perform the operation to calculate area and circumference
	// of circle.
	void calculateAreaAndCircumference() {
		double area = 3.14 * radius * radius;
		double circumference = 2 * 3.14 * radius;

		// Display area of the circle
		System.out.println("Area of circle is: " + area);

		// Display circumference of the circle.
		System.out.println("Circumference of circle is: " + circumference);
	}

}
