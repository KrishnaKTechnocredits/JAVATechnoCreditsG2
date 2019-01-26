/*
 * This Program will convert temperature from fahrenheit to celsius degree
 */
package soumya;

public class TempConverter_Client {
	public static void main(String[] args) {
		TempConverter_Service o1 = new TempConverter_Service();
		o1.TempConverter();
	}
}
