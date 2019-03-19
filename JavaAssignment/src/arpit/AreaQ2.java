package arpit;

import java.util.Scanner;

public class AreaQ2 {
	
	//This function calculate area of the square and display the area and also take one integral type parameter. 
	void area(int side)
	{
		int squareArea =side*side;
		System.out.println("Area of square is: "+ squareArea);
	}
	
	//This function calculate area of the rectangle and display the area and also take two integral type parameter.
	void area(int length, int breadth)
	{
		int rectangleArea = length* breadth;
		System.out.println("Area of rectangle is: "+ rectangleArea);
	}
	
	//This function calculate area of the circle and display area and also take one floating type parameter.
	void area(float radius)
	{
		double circleArea = 3.14*radius*radius;
		System.out.println("Area of circle is: "+ circleArea);
	}

	
	public static void main(String[] args) {
		
		//Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Creating object of class
		AreaQ2 areaQ2 = new AreaQ2();
		
		System.out.println("side of area:");
		//Take side of the square from user.
		int side = sc.nextInt();
		
		//Call one parameterized of integral type method.
		areaQ2.area(side);
		
		System.out.println("Enter length and breadth of rectangle: ");
		
		//Take length of the rectangle from user
		int length =sc.nextInt();
		
		//Take breadth of the rectangle from user
		int breadth = sc.nextInt();
		
		//Call two parameterized of integral type method.
		areaQ2.area(length, breadth);
		
		System.out.println("Radius of circle: ");
		
		//Take radius of the circle from user
		float radius = sc.nextFloat();
		
		//Call one parameterized of floating type method.
		areaQ2.area(radius);
	}
}
