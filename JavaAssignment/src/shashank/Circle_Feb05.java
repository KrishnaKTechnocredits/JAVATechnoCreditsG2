package shashank;

import java.util.Scanner;

public class Circle_Feb05 
{
	final float pi=(float)22/7;
	float radius;
	void takeInputRadius()
	{
		System.out.println("Please enter the radius for circle to calculate area and circumference - ");
		Scanner sc= new Scanner(System.in);
		radius=sc.nextFloat();
	}
	
	void areaOfCircle()
	{
		System.out.println("Area of circle with radius "+radius+" is : "+(pi*radius*radius));
	}
	
	void perimeterOfCircle()
	{
		System.out.println("Circumference of circle with radius "+radius+" is : "+(2*pi*radius));
	}
}
