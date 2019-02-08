package shashank;

import java.util.Scanner;

public class AreaOfShapes_Q7Feb03 
{
	final float pi=(float)22/7;
	float areaRect(float l, float b)
	{
		return l*b;
	}
	
	float areaTriangle(float b, float h)
	{
		return b*h*(1/2);
	}
	
	float areaCircle(float r)
	{
		return pi*r*r;
	}
	
	void menuOfFigure()
	{
		System.out.println("Enter the shape of which area is to be calculated: 1-Rectangle 2-Triangle 3-Circle");
		Scanner sc = new Scanner(System.in);
		int shape=sc.nextInt();
		AreaOfShapes_Q7Feb03 as1 = new AreaOfShapes_Q7Feb03();
		
		switch(shape)
		{
		case 1:
			System.out.println("Please enter the length and breadth of the rectangle : ");
			float length=sc.nextFloat();
			float breadth=sc.nextFloat();
			System.out.println("Area of rectanctangle with length "+length+" and breadth "+breadth+" is "+as1.areaRect(length, breadth));
			break;
			
		case 2:
			System.out.println("Please enter the base and height of the right angled rectangle : ");
			float base=sc.nextFloat();
			float height=sc.nextFloat();
			System.out.println("Area of triangle having base "+base+" and height "+height+" is "+as1.areaTriangle(base, height));
			break;
			
		case 3:
			System.out.println("Please enter the radius of circle : ");
			float radius=sc.nextFloat();
			System.out.println("Area of circle with radius "+radius+" is "+as1.areaCircle(radius));
		}
	}
	
	public static void main(String[] args) 
	{
		AreaOfShapes_Q7Feb03 as2 = new AreaOfShapes_Q7Feb03();
		as2.menuOfFigure();
	}
}
