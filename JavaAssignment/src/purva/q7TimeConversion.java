package purva;

import java.util.Scanner;

public class q7TimeConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time in seconds: ");
		double sec = sc.nextDouble();
		System.out.println("\n" + "Seconds to hours, minute and second coversion for " + (int) sec + "s: ");
		timeConversion(sec);
		sc.close();
	}

	static void timeConversion(double seconds) {

		/* This line of code prints hours */
		double hour = seconds / 3600;
		double d = hour;
		int final_hour = (int) hour;
		System.out.printf(final_hour + "hours ");
		/* hours code ended here */

		/* below block of code will print minutes */
		double mns_double = NumberAfterDecimal(d);
		double temp_m = mns_double * 60;
		double temp_s = temp_m;
		int final_minutes = (int) temp_m;
		System.out.printf(final_minutes + "minutes ");
		/* minutes code ended here */

		/* below block of code will print seconds */
		double s1 = NumberAfterDecimal(temp_s);
		double final_seconds = s1 * 60;
		System.out.printf((int) final_seconds + "seconds ");
		/* seconds code ended here */

	}

	/* Below block of code will return digits after decimal point 8 */
	static double NumberAfterDecimal(double d) {
		int dd = (int) d;
		double d1 = d - dd;
		// double temp_min=d-dd;
		// return temp_min;
		return d1;
	}

}
