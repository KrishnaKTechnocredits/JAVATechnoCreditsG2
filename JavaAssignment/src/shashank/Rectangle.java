package shashank;

public class Rectangle //This is class to do calculations related to Rectangle
{
	float rectPerimeter(float length, float breadth)  //Calculates perimeter of Rectangle
	{
		return 2*(length+breadth);
	}
	
	float rectArea(float length, float breadth)  //Calculates area of Rectangle
	{
		return length*breadth;
	}
	 
	void displayCalc(float length, float breadth)  //Displays perimeter and area for Rectangle
	{
		System.out.println("The perimeter of Rectangle is "+rectPerimeter(length, breadth)+" and its area is "+rectArea(length, breadth));
	}
}
