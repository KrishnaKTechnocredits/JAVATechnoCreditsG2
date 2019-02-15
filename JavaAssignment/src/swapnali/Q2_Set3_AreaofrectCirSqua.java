package swapnali;

import java.util.Scanner;

public class Q2_Set3_AreaofrectCirSqua {
static int operation;
static Scanner scanner;
float radius=0f;
int side=0,length=0,breadth=0;

	public static void main(String args[]){
		
		scanner=new Scanner(System.in);
		System.out.println("Menu: ");
		System.out.println("1.Area of a Circle");
		System.out.println("2.Area of a Square");
		System.out.println("3.Area of a Rectangle");
		System.out.println("4.Exit");
	  
		System.out.println("Enter your option: ");
		operation=scanner.nextInt();
		Q2_Set3_AreaofrectCirSqua area=new Q2_Set3_AreaofrectCirSqua();
		area.selectOperation();
	}
	
	void selectOperation(){		
		
		switch(operation)
		{
		case 1: 
				Float areaOfcircle=calculateArea(radius);
				System.out.println("Area of Circle is: "+areaOfcircle);
               	break;
        
		case 2: 
               	int areaofSquare=calculateArea(side);
               	System.out.println("Area of square is: "+areaofSquare);
               	break;

		case 3: 
				int areaOfRectangle=calculateArea(length, breadth);	
				System.out.println("Area of rectangle is: "+areaOfRectangle);
				break;

		default:System.out.println("Invalid Operation");
		}
	}

	float calculateArea(Float radius) {
		
		System.out.println("Enter radius: ");
		radius = scanner.nextFloat();		
		float areaOfcircle = 3.14f * radius * radius;
		return areaOfcircle;
	}
	int calculateArea(int side) {	
		
		System.out.println("Enter side: ");
		side = scanner.nextInt();
		int areaofSquare = side * side;
		return  areaofSquare;
	}

	int calculateArea(int length, int breadth) {
		
		System.out.println("Enter length and breadth");
		length = scanner.nextInt();
		breadth = scanner.nextInt();
		int areaOfRectangle = length * breadth;
		return areaOfRectangle;
	}

	

}
