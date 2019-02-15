package swapnali;

import java.util.Scanner;

public class Q5_DisplayWeekdays {
static int operation;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weekday: ");
		int day=sc.nextInt();
		Q5_DisplayWeekdays.displayWeekday(day);

	}
	static void displayWeekday(int day){			
			
		if(day>6)
		{
			day=day%7;
		}
			switch (day) {
			case 1:
				System.out.println("Monday" );
				break;
			case 2:
				System.out.println("Tuesday:");
				break;
			case 3:
				System.out.println("Thursday");
				break;
			case 4:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Invalid Operation");
			}
	}
	
}
