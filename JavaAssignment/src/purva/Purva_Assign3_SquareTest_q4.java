/* Square Test class test functionality written in Square class
 * Create a Square class with field side, one parameterized constructor which accept side value . Write a method to find the area of a square. Write a TestSquareClass to verify Square class functionality.
NOTE : square method should not take any parameter, constructor should set side value in instance variable and square method should use that instance variable.
(area=side*side) */

package purva;

import java.util.*;

public class Purva_Assign3_SquareTest_q4 {
	public static void main(String[] args) {
		char choice = 'y';
		do {
			float sides;
			System.out.println("\n" + "Enter the side of square: ");
			Scanner sc = new Scanner(System.in);
			sides = sc.nextFloat();
			Purva_Assign3_Square_q7 obj1 = new Purva_Assign3_Square_q7(sides);
			obj1.areaSquare();
			System.out.println("\n" + "Do you want to continue. Enter y or n: ");
			Scanner sc2 = new Scanner(System.in);
			choice = sc2.next().charAt(0);
		} while ((choice == 'y') || (choice == 'Y'));
		System.out.println("Program ended!!");
	}
}
