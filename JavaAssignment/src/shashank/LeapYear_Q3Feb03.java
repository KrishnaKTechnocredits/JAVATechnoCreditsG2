package shashank;

import java.util.Scanner;

public class LeapYear_Q3Feb03 
{
	void checkLeap(int year)
	{
		if (year%4==0)
			System.out.println(year+" is a leap year!");
		else
			System.out.println(year+" is not a leap year!");
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter the year to check if it is leap year or not : ");
		Scanner sc = new Scanner(System.in);
		LeapYear_Q3Feb03 ly= new LeapYear_Q3Feb03();
		ly.checkLeap(sc.nextInt());
	}
}
