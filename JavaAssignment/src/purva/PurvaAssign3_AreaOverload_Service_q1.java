/* Create a class Area to find the area of Square, Rectangle and Circle by creating area() method . 
 * Using overloading concept here.
 * this is service class where all overloaded area() is written. All methods written value of area to main class switch case options */
package purva;

public class PurvaAssign3_AreaOverload_Service_q1 {

	/* Calculates area of square */
	double area(float side) {
		return (side * side);
	}

	/* Calculates area of rectangle */
	double area(double length, double breadth) {
		return (length * breadth);
	}

	/* Calculates area of circle */
	double area(double radius) {
		return (3.14 * radius * radius);
	}
}
