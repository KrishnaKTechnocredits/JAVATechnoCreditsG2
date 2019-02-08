/* 
 * This Program calculates addition,subtraction,multiplication,division and remainder of two numbers
 */
package soumya;

public class Calculator_Client {
	public static void main(String[] args) {
		Calculator_Service calculate = new Calculator_Service();
		calculate.calculator();
	}
}
