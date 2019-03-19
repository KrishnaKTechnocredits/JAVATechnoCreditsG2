package rashmi;

import java.util.Scanner;

public class DisplayNameOfDay 
{
	int conversion(int Day)
	{
		int weekDay;
		if(Day>=7)
		
			weekDay=Day%7;
		else
			weekDay=Day;
		
			return weekDay;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		DisplayNameOfDay obj = new DisplayNameOfDay();
		int weekDay = obj.conversion(input);
		
		switch(weekDay)
		{
		case 0: 
			 System.out.println("Sunday");
			break;
		case 1:
			 System.out.println("Monday");
			break;
		case 2:
			 System.out.println("Tuesday");
			break;
		case 3:
			 System.out.println("Wednesday");
			break;
		case 4:
			 System.out.println("Thursday");
			break;
		case 5:
			 System.out.println("Friday");
			break;
		case 6:
			 System.out.println("Saturday");
			break;
		default:
			break;
				
		}
		
	}

}
