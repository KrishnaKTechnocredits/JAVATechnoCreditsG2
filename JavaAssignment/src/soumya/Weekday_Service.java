package soumya;
import java.util.Scanner;
public class Weekday_Service {
	int num,remainder;
// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		if (num > 7) {
			remainder = num % 8;
			if (remainder>7)
			{
				remainder = 0 + 7;
			}
			else if(remainder==0)
			{
				remainder = 0 + 1;
			}
		}
		sc.close();
	}
// Method for displaying weekday according to user choice
	void weekday() {
		InputOutput();
		switch (remainder) {
		case 1:
			System.out.println("Day is: Monday");
			break;
		case 2:
			System.out.println("Day is: Tuesday");
			break;
		case 3:
			System.out.println("Day is: Wednesday");
			break;
		case 4:
			System.out.println("Day is: Thursday");
			break;
		case 5:
			System.out.println("Day is: Friday");
			break;
		case 6:
			System.out.println("Day is: Saturday");
			break;
		case 7:
			System.out.println("Day is: Sunday");
			break;
		default:
			System.out.println("Choice not found");
		}
	}
}
