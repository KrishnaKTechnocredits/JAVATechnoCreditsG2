/*
 * This Program will check leap year
 */
package soumya;

public class LeapYear_Client {
	public static void main(String[] args) {
		LeapYear_Service lyear = new LeapYear_Service();
		lyear.InputOutput();
		lyear.leapYear();
	}
}
