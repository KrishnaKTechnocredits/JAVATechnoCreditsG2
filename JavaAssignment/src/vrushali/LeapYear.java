package vrushali;

import java.util.Scanner;

// Prgram to calculate the given year is leap year or not
public class LeapYear {

	public int leapYear() {
		System.out.println("Enter year to check whether that year is leap year or not");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}

		return 0;
	}

	public static void main(String[] args) {
		LeapYear leapY = new LeapYear();
		leapY.leapYear();
	}
}
