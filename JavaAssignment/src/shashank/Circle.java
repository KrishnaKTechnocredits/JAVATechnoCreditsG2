package shashank;

public class Circle //This is class to do calculations related to Circle
{
	float pi = (float)22/7;
	float cirPerimeter(float radius)  //Calculates perimeter of circle
	{
		return 2*pi*radius;
	}
	
	float cirArea(float radius)   //Calculates area of circle
	{
		return pi*radius*radius;
	}
	
	void displayCalc(float radius)  //Displays perimeter and area for Circle
	{
		System.out.println("The perimeter of Circle is "+cirPerimeter(radius)+" and its area is "+cirArea(radius));
	}
}
