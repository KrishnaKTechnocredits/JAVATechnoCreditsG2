package arpit;

import java.util.Scanner;

public class LeapYearOrNonLeapYear {

	// This function perform to check given year is leap year or not and return
	// result
	boolean checkLeapYear(int year) {

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {

			return true;

		} else {

			return false;
		}

	}

	// This function display the given year is leap year or not
	void display(boolean result) {

		System.out.println("The given Year is a leap year:  " + result);
	}

	public static void main(String[] args) {

		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year which you want to check: ");

		// Take year from user
		int year = sc.nextInt();

		// Creating object of class
		LeapYearOrNonLeapYear leapYearNonLeapyear = new LeapYearOrNonLeapYear();

		// To call checkLeapYear method and provide input to that method
		boolean b = leapYearNonLeapyear.checkLeapYear(year);

		// To call display method and provide input to that method
		leapYearNonLeapyear.display(b);
		sc.close();

	}

}
