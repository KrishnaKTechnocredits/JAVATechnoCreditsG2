package arpit;

import java.util.Scanner;

public class DisplayWeekdaysQ5 {

	// This function take the integer number from user and show the Weekday
	// corresponds to that number
	void displayWeekdays(int num) {

		int number = num % 7;

		switch (number) {

		case 0:
			System.out.println("Day is Sunday");
			break;
		case 1:
			System.out.println("Day is Monday");
			break;
		case 2:
			System.out.println("Day is Tuesday");
			break;
		case 3:
			System.out.println("Day is Wednesday");
			break;
		case 4:
			System.out.println("Day is Thursday");
			break;
		case 5:
			System.out.println("Day is Friday");
			break;
		case 6:
			System.out.println("Day is Saturday");
			break;
		default:
			System.out.println("Give proper number");

		}
	}

	public static void main(String[] args) {

		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		// Take integer number from user
		int num = sc.nextInt();

		// Creating object of the class
		DisplayWeekdaysQ5 displayDays = new DisplayWeekdaysQ5();

		// To call displayWeekdays method and provide input to that method
		displayDays.displayWeekdays(num);
		sc.close();
	}

}
