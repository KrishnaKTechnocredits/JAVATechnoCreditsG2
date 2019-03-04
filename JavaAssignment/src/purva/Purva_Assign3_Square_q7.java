/* Create a Square class with field side, one parameterized constructor which accept side value . Write a method to find the area of a square. Write a TestSquareClass to verify Square class functionality.
NOTE : square method should not take any parameter, constructor should set side value in instance variable and square method should use that instance variable.
(area=side*side)*/

package purva;

public class Purva_Assign3_Square_q7 {
	float side, area;

	/* constructor which initialized instance variable side */
	Purva_Assign3_Square_q7(float sd) {
		side = sd;
	}

	/*
	 * area method calculates area of square, take value of side from instance
	 * variable. If side <=0 prints invalid input
	 */
	void areaSquare() {
		if (side > 0) {
			area = side * side;
			System.out.println("Area of cirlce = " + area);
		} else {
			System.out.println("Invalid input. Please enter valid input");
		}
	}
}
