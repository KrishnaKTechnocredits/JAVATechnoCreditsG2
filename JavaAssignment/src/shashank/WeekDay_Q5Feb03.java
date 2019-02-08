package shashank;

import java.util.Scanner;

public class WeekDay_Q5Feb03 {

		void dayOfWeek(int day)
		{	
			if (day%7==0 && day!=0)
				day=7;
			else
				day=day%7;
			switch(day)
			{
				case 1:
					System.out.println("The day is Sunday");
					break;
				case 2:
					System.out.println("The day is Monday");
					break;
				case 3:
					System.out.println("The day is Tuesday");
					break;
				case 4:
					System.out.println("The day is Wednesday");
					break;
				case 5:
					System.out.println("The day is Thursday");
					break;
				case 6:
					System.out.println("The day is Friday");
					break;
				case 7:
					System.out.println("The day is Saturday");
					break;
				default:
					System.out.println("Invalid input");
					
			}
		}	
		
		public static void main(String[] args) 
		{
			System.out.println("Please enter number between 1 to 7, to know underlying day");
			Scanner sc = new Scanner(System.in);
			WeekDay_Q5Feb03 wd = new WeekDay_Q5Feb03();
			wd.dayOfWeek(sc.nextInt());
		}
}
