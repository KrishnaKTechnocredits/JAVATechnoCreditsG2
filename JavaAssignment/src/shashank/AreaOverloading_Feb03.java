package shashank;

import java.util.Scanner;

public class AreaOverloading_Feb03 
{
	final float pi= (float)22/7;
	void area(int val1)
	{
		System.out.println("Area of square is "+(val1*val1));
	}

	void area(int val1, int val2)
	{
		System.out.println("Area of rectangle is "+(val1*val2));
	}
	
	void area(float val1)
	{
		System.out.println("Area of circle is "+(pi*val1*val1));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AreaOverloading_Feb03 ao1 = new AreaOverloading_Feb03();
		System.out.println("Please enter which shape's are is to be calculated: 1.Square 2.Rectangle 3.Circle");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Pleas enter side of the square ");
			ao1.area(sc.nextInt());
			break;
		case 2:
			System.out.println("Pleas enter length and breadth of the rectangle ");
			ao1.area(sc.nextInt(), sc.nextInt());
			break;
		case 3:
			System.out.println("Pleas enter radius of the circle ");
			ao1.area(sc.nextFloat());
			break;
		default:
			System.out.println("Invalid input");
		}
	}
}

