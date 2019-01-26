package soumya;

public class AreaAndPerimeter_Service {
	
	// Method to find area of rectangle
	public void areaRect(double x, double y) {
		System.out.println("Area of rectangle is");
		System.out.println(x * y);
	}

	// Method to find perimeter of rectangle
	public void perimeterRect(double x, double y) {
		System.out.println("Perimeter of Rectangle is: ");
		System.out.println(2 * (x + y));
	}

	// Method to find area of circle
	public void areaCircle(double r) {
		System.out.println("Area of Circle is");
		System.out.println(3.14159 * r * r);
	}

	// Method to find perimeter of circle
	public void perimeterCircle(double r) {
		System.out.println("Perimeter of Circle is: ");
		System.out.println(2 * 3.14159 * r);
	}
}
