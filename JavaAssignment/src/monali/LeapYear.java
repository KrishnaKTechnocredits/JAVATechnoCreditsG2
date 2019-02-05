package monali;

import java.util.Scanner;

public class LeapYear {

	void leapYear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter is year to check wheather it is leap year or not: ");
		int year = sc.nextInt();
		sc.close();

		if (year % 400 == 0 || (year % 100 == 0 && year % 4 == 0))
			System.out.println("Given year is leap year : " + year);
		else
			System.out.println("Given year is not leap year: " + year);
	}

	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		ly.leapYear();
	}
}
