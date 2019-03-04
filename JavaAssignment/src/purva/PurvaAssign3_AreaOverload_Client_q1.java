/* Create a class Area to find the area of Square, Rectangle and Circle by creating area() method . 
 * Using overloading concept here.
 * 
 * */

package purva;

import java.util.Scanner;

public class PurvaAssign3_AreaOverload_Client_q1 {
	public static void main(String[] args) {

		char c = 'y';
		int option;
		PurvaAssign3_AreaOverload_Service_q1 obj1 = new PurvaAssign3_AreaOverload_Service_q1();

		do {
			System.out.println("\n" + "Menu");
			System.out.println("1. Area of square");
			System.out.println("2. Area of rectangle");
			System.out.println("3. Area of circle");
			System.out.println("4. Exit");

			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();

			switch (option) {
			/* case 1 is for area of square */
			case 1:
				double area_square = 0;
				System.out.println("Enter side of square: ");
				Scanner sc2 = new Scanner(System.in);
				float sd = sc2.nextFloat();
				if (sd > 0) {
					area_square = obj1.area(sd);
					System.out.println("Area of square = " + area_square);
				} else
					System.out.println("Invalid input. Please enter side>0");
				break;

				/* case 2 is for area of rectangle */
			case 2:
				System.out.println("Enter length of rectangle: ");
				Scanner sc3 = new Scanner(System.in);
				float len = sc3.nextFloat();
				if (len > 0) {
					System.out.println("Enter breadth of rectangle: ");
					Scanner sc4 = new Scanner(System.in);
					float br = sc4.nextFloat();
					if (br > 0) {
						double area_rec = obj1.area(len, br);
						System.out.println("Area of rectangle = " + area_rec);
					} else
						System.out.println("Invalid input. Please enter values>0");
				} else
					System.out.println("Invalid input. Please enter values>0");
				break;

				/* case 3 is for area of circle */
			case 3:
				System.out.println("Enter radius of circle: ");
				Scanner sc5 = new Scanner(System.in);
				float rd = sc5.nextFloat();
				if (rd > 0) {
					double area_circle = obj1.area(rd);
					System.out.println("Area of circle = " + (float) area_circle);
				} else
					System.out.println("Invalid input. Please enter readius>0");
				break;

				/* case 4 is for ending the program */
			case 4:
				System.out.println("\n" + "Program has ended");
				System.exit(0);

			default:
				System.out.println("Invalid choice. Please select any 1 option from 1-3.");
			}
		} while ((c == 'y') || (c == 'Y'));
	}
}
