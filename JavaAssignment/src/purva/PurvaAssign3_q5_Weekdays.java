/* Write a Java program that keeps a number from the user and 
generates an integer between 1 and 7 and displays the name of the weekday. (use switch case) */ 

package purva;

import java.util.Scanner;

public class PurvaAssign3_q5_Weekdays {
	public static void main(String[] args) {
		int answer = 0;
		do {
			System.out.println("\n" + "Enter a numeric number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			/*
			 * Remainder value after dividing number by 7 will be decide the day
			 * of week
			 */
			answer = num % 7;
			System.out.println("Number corresponding to day of week = " + answer);

			switch (answer) {
			case 0:
				System.out.println("You have entered " + answer + " and its a SUNDAY!!");
				break;
			case 1:
				System.out.println("You have entered " + answer + " and its a MONDAY!!");
				break;
			case 2:
				System.out.println("You have entered " + answer + " and its a TUESDAY!!");
				break;
			case 3:
				System.out.println("You have entered " + answer + " and its a WEDNESDAY!!");
				break;
			case 4:
				System.out.println("You have entered " + answer + " and its a THURSDAY!!");
				break;
			case 5:
				System.out.println("You have entered " + answer + " and its a FRIDAY!!");
				break;
			case 6:
				System.out.println("You have entered " + answer + " and its a SATURDAY!!");
				break;
			default:
				System.out.println("You have entered an invalid number");
				System.exit(0);
			}

		} while (true);
	}
}
