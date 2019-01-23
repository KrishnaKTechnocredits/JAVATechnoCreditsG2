/*
 * This Program will convert seconds to hours,minutes and seconds
 */
package soumya;

public class TimeConverter_Client {
	public static void main(String[] args) {
		TimeConverter_Service o1 = new TimeConverter_Service();
		o1.secConverter();
	}
}
