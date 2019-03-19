/* 
* This Program will calculate area of square,circle and rectangle
*/
package soumya;

import java.util.Scanner;

public class AreaQ2_Client {
	public static void main(String[] args) {
		AreaQ2_Service area = new AreaQ2_Service();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side: ");
		int side = sc.nextInt();
		int areaSquare = area.area(side, side);
		System.out.println("Area of square is: " + areaSquare);
		System.out.println("Enter Length and Breadth: ");
		float length = sc.nextFloat();
		float breadth = sc.nextFloat();
		float areaRectangle = area.area(length, breadth);
		System.out.println("Area of rectangle is: " + areaRectangle);
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();
		double areaCircle = area.area(radius);
		System.out.println("Area of circle is: " + areaCircle);
		sc.close();
	}
}
