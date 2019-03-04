package vrushali;

import java.util.Scanner;

public class WeekDays {
	public static void main(String[] args) {
		System.out.println("Enter number between 1 to 7");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		WeekDays wk = new WeekDays();
		String weekday= wk.weekdaysCalc(day);
		System.out.println(weekday);
	}

	public String weekdaysCalc(int day) {
		String dayName = "";
		switch (day) {
		case 1: dayName = "Monday";

			break;
			case 2: dayName = "Tuesday";

			break;
			case 3: dayName = "Wednesday";

			break;
			case 4: dayName = "Thursday";

			break;
			case 5: dayName = "Friday";

			break;
			case 6: dayName = "Saturday";

			break;
			case 7: dayName = "Sunday";

			break;
			
		default:
			System.out.println("Invalid Selection");
			break;
		}

		return dayName;
	}
}
