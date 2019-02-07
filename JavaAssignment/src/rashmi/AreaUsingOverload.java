package rashmi;

import java.util.Scanner;

public class AreaUsingOverload 
{
	void area(int radius)
	{
		double areaOfCircle=3.14*radius*radius;
		System.out.println(areaOfCircle);
	}
	
	void area(int length, int breadth)
	{
		double areaOfRec=length*breadth;
		System.out.println(areaOfRec);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int radius=sc.nextInt();
	    int length=sc.nextInt();
	    int breadth=sc.nextInt();
	    AreaUsingOverload obj = new AreaUsingOverload();
		obj.area(radius);
		obj.area(length, breadth);
	}

}
