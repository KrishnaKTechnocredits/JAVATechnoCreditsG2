package monali;

public class Q4_PeriArea {

	public static void main(String[] args) {
		double length = Double.parseDouble(args[0]);
		double width = Double.parseDouble(args[1]);
		double radius = Double.parseDouble(args[2]);
		double AreaR = length * width;
		double PerimeterR = 2 * (length + width);
		double AreaC = 3.14 * radius * radius;
		double PerimeterC = 2 * 3.14 * radius;
		System.out.println("Area of Rectangle: " + AreaR);
		System.out.println("Perimeter of Rectangle: " + PerimeterR);
		System.out.println("Area of Circle: " + AreaC);
		System.out.println("Perimeter of Circle: " + PerimeterC);

	}
}
