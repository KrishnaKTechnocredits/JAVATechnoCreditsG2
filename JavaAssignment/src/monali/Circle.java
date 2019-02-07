package monali;

import java.util.Scanner;

public class Circle {
	float radius;
	
	void inputRadius()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of circle : ");
		radius=sc.nextFloat();
		sc.close();
	}
	
	void areaOfCircle()
	{
		float areaCir=(float) (3.14*(radius*radius));
		System.out.println("Area of circle is : "+areaCir);
	}
	void areaOfCircumference()
	{
		float areaCircum=(float)(2*3.14*radius);
		System.out.println("Area of circumference : "+areaCircum);
	}
	
	

}
