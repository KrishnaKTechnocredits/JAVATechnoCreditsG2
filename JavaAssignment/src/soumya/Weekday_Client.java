/* 
 * This Program takes a number from the user between 1 and 7 and displays the name of the weekday
 */
package soumya;

public class Weekday_Client {
	public static void main(String[] args) {
		Weekday_Service day = new Weekday_Service();
		day.weekday();
	}
}
