package rashmi;

import java.util.Scanner;

public class LeapYear {
	
	void checkleap(int year)
	{
		if(year%4==0)
		{
			System.out.println("Given year " +year +" is leap year");
		}
		else
			System.out.println("Given year " +year +" is not leap year");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		LeapYear leap = new LeapYear();
		leap.checkleap(year);
	}

}
