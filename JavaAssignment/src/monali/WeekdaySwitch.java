package monali;

import java.util.Scanner;

public class WeekdaySwitch {

	static void weekDay() {
		String day = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		if (num > 7) {
			num = num % 7;
		}
		switch (num) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thrusday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		}
		System.out.println("Entered choice day is: " + day);
	}

	public static void main(String[] args) {
		weekDay();

	}
}
