package purva;

import java.util.Scanner;

public class PurvaAssign3_JDM_q3 {
	public static void main(String[] args) {
		int year = 0;
		System.out.println("Please enter year: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		PurvaAssign3_JDM_q3 obj1 = new PurvaAssign3_JDM_q3();
		obj1.leapYearCalculation(year);
		sc.close();
	}

	void leapYearCalculation(int yr) {
		/* Below code will print year is a leap year */

		if ((yr % 4 == 0) && (yr % 100 == 0) && (yr % 400) == 0) {
			System.out.println("Year " + yr + " is a leap year");
		}

		else if ((yr % 4 == 0) && (yr % 100 != 0)) {
			System.out.println("Year " + yr + " is a leap year");
		}

		/* Below code will print year is a not a leap year */
		else if (yr % 4 != 0) {
			System.out.println("Year " + yr + " is not a leap year");
		}

		else if ((yr % 4 == 0) && (yr % 100 == 0) && (yr % 400) != 0) {
			System.out.println("Year " + yr + " is not a leap year");
		}
	}
}
