/* Create a Circle class with fields radius as float Initialize the radius through method. 
 * Also create separate method to calculate Area and Circumference of a Circle. 
 * Create another class as ClientCircle and call the respective methods. 
 * 
 * This is client class which calls service class constructor for initializing radius. 
 * It calculated area and circumference of circle with the help of this initialized radius value*/

package purva;

import java.util.Scanner;

public class Purva_Assign3_CircleClient_q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		float rad = sc.nextFloat();
		/* service class constructor called and radius initialized */
		Purva_Assign3_CircleService_q1 obj1 = new Purva_Assign3_CircleService_q1(rad);
		// obj1.setRadius(rad);
		obj1.circleArea(rad);
		obj1.circumferenceCircle(rad);
	}

}
