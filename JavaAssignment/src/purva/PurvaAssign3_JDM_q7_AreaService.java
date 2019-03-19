package purva;

import java.util.Scanner;

public class PurvaAssign3_JDM_q7_AreaService {
	void areaRectangle()
	{
		System.out.println("\n"+"Enter length: ");
		Scanner sc1 = new Scanner(System.in);
		float len = sc1.nextFloat();
		System.out.println("Enter breadth: ");
		Scanner sc2 = new Scanner(System.in);
		float br = sc2.nextFloat();
		float areaR = len * br;
		System.out.println("Area of Rectangle = "+areaR);
	}
	void areaTriangle()
	{
		System.out.println("\n"+"Enter base: ");
		Scanner sc1 = new Scanner(System.in);
		double base = sc1.nextDouble();
		System.out.println("Enter heigth: ");
		Scanner sc2 = new Scanner(System.in);
		double ht = sc2.nextDouble();
		double areaT = 0.5 * base * ht;
		System.out.println("Area of Rectangle = "+areaT);
	}
	void areaCircle()
	{
		System.out.println("\n"+"Enter radius of circle: ");
		Scanner sc1 = new Scanner(System.in);
		double rd = sc1.nextFloat();
		double areaC = 3.14 * rd * rd;
		System.out.println("Area of Rectangle = "+areaC);
	}

}
