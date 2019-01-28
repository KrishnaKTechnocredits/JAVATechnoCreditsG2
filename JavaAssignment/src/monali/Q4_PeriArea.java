package monali;

public class Q4_PeriArea {

	public static void main(String[] args) {
		double length = Double.parseDouble(args[0]);
		double width = Double.parseDouble(args[1]);
		double radius = Double.parseDouble(args[2]);
		Area(length, width, radius);
		Perimeter(length, width, radius);
	}

	static void Area(double length, double width, double radius) {
		double AreaR = length * width; // Area of rectangle
		System.out.println("Area of Rectangle: " + AreaR);
		double AreaC = 3.14 * radius * radius; // Area of circle
		System.out.println("Area of Circle: " + AreaC);

	}

	static void Perimeter(double length, double width, double radius) {
		double PerimeterR = 2 * (length + width);
		System.out.println("Perimeter of Rectangle: " + PerimeterR);
		double PerimeterC = 2 * 3.14 * radius;
		System.out.println("Perimeter of Circle: " + PerimeterC);
	}

}
