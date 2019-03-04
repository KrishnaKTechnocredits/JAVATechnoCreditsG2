package swapnali;

import java.util.Scanner;

public class Q1_Set2_AreaCircumCircle {
	static float radius;
	void getRadius()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = scanner.nextFloat();
	}
	float calculateAreaOfcircle() {
		
		float areaOfcircle = 3.14f * (radius * radius);
		return areaOfcircle;
	}
	float calculateCircumferenceOfCircle() {	
		float pi=3.14f;
		float circumferenceOfCircle = 2*pi*radius;
		return  circumferenceOfCircle;
	}
	void displayAreaAndCircumference()
	{
		float areaOfcircle=calculateAreaOfcircle();
		System.out.println("Area of circle is: "+areaOfcircle);
		float circumferenceOfCircle=calculateCircumferenceOfCircle();
		System.out.println("Circumference of circle is: "+circumferenceOfCircle);
	}
}

