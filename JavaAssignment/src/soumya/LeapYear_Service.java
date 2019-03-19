package soumya;

import java.util.Scanner;

public class LeapYear_Service {
	int year;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check if it's a leap year: ");
		year = sc.nextInt();
		sc.close();
	}

	// Method for leap year
	void leapYear() {
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
