/* 
 * This Program calculates addition,subtraction,multiplication,division and remainder of two numbers
 */

package soumya;

public class Calculation_Client {

	public static void main(String[] args) {
		Calculation_Service o1 = new Calculation_Service();

		o1.scannerInput();
		o1.sum();
		o1.subtract();
		o1.multiply();
		o1.divide();
		o1.remainder();
	}

}
