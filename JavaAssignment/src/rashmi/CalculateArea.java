package rashmi;

import java.util.Scanner;

public class CalculateArea 
{
	  int areaOfRectangle(int length,int breadth)
	  {
		  int areaOfRec;
		  return areaOfRec=length*breadth;
	  }   
	 
	  double areaOfTriangle(double base,double height)
	  {
		  double areaOfTri;
		  return areaOfTri=base*height;
	  }
	  
	  double perimeterOfCircle(double radius)
	  {
		  double perimeter;
		  return perimeter=3.14*radius*radius;
	  }
	  
	  public static void main(String[] args)
		 {
			 Scanner sc=new Scanner(System.in);
			 int choice=sc.nextInt();
			 
			 CalculateArea cal = new CalculateArea();
			 switch(choice)
			 {
				case 1: int areaOfRec=cal.areaOfRectangle(10, 21);
				    System.out.println(areaOfRec);
					break;
				case 2: double areaOfTri=cal.areaOfTriangle(5.9, 4.2);
				    System.out.println(areaOfTri);
					break;
				case 3: double perimeter=cal.perimeterOfCircle(6);
				    System.out.println(perimeter);
					break;
				default:
					System.out.println("Value out of Range");
					break;
						
		     }
		 }
}
