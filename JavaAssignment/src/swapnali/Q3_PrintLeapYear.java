package swapnali;

import java.util.Scanner;

public class Q3_PrintLeapYear {
	
		public static void main(String[] args) {
		Q3_PrintLeapYear leapYear=new Q3_PrintLeapYear();
		leapYear.isLeapYear();
	}
	
	void isLeapYear()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year to want to find: ");
		int years=scanner.nextInt();
		scanner.close();
		
		if((years%400==0 || years%100!=0)&& years%4==0)
		{
			System.out.println("This years is leap year");
		}
		else
		{
			System.out.println("This years is not leap year");
		}
		
	}
}
