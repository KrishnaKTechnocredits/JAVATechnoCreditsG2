package vrushali;

public class AreaOfRectangleAndCircle {
	static int l, w, areaR, periOfRectangle;
	static int r;
	static double pi = 3.14, areaC, perOfCircle;

	static void rectangle(int l, int w) {
		areaR = l * w;
		System.out.println("Area Of Rectangle with length "+l+ " and width " +w+ " is: " + areaR);

		periOfRectangle = 2 * (l + w);
		System.out.println("Perimeter of Rectangle is: " + periOfRectangle);
	}

	static void Circle(int r) {
		areaC = pi * r * r;
		System.out.println("Area Of Rectangle with radius " +r+ " is: " + areaC);

		perOfCircle = 2 * pi * r;
		System.out.println("Perimeter of Rectangle is: " + perOfCircle);
	}

	public static void main(String[] args) {
		int l = Integer.parseInt(args[0]);
		int w = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		
		AreaOfRectangleAndCircle.rectangle(l, w);
		AreaOfRectangleAndCircle.Circle(r);

	}
}
