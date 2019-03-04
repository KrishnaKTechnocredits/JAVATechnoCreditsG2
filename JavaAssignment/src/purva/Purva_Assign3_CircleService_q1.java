/* Create a Circle class with fields radius as float Initialize the radius through method. 
 * Also create separate method to calculate Area and Circumference of a Circle. 
 * Create another class as ClientCircle and call the respective methods. 
 * 
 * This is service class where all methods are defined. Client class calls all these methods */

package purva;

public class Purva_Assign3_CircleService_q1 {
	float radius;

	/*
	 * this is constructor which accepts a float parameter as radius. It is
	 * called by client class and initialized while object creation
	 */
	Purva_Assign3_CircleService_q1(float r) {
		radius = r;
	}

	/*
	 * float setRadius(float r) { radius=r; return radius; }
	 */

	/* this method calculates area of circle */
	void circleArea(float r) {
		double areaC = 3.14 * r * r;
		System.out.println("\n" + "Area of circle = " + (float) areaC);
	}

	/* this method calculates circumference of circle */
	void circumferenceCircle(float r) {
		double circumf = 2 * 3.14 * r;
		System.out.println("\n" + "Circumference of circle = " + (float) circumf);
	}
}
