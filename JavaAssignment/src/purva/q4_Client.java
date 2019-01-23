package purva;

import java.util.Scanner;

public class q4_Client {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Widht of rectangle = ");
		float wid = sc.nextFloat();
		System.out.println("Enter Height of rectangle = ");
		float height = sc.nextFloat();
		System.out.println("Enter Radius of circle = ");
		float radius = sc.nextFloat();

		q4_Service q4 = new q4_Service();

		System.out.println("\nEnter which operation number from below list:");
		System.out.println("1. Calculate the area of rectangle");
		System.out.println("2. Calculate the area of circle");
		System.out.println("3. Calculate the perimeter of rectangle");
		System.out.println("4. Calculate the perimeter of circle");

		int i;
		do {
			System.out.println("\nChoose option between 1 and 4");
			i = sc.nextInt();
			{
				if (i == 1)
					q4.AreaRectangle(wid, height);
				else if (i == 2)
					q4.AreaCircle(radius);
				else if (i == 3)
					q4.PerimeterRect(wid, height);
				else if (i == 4)
					q4.PerimeterCircle(radius);
			}

		} while (i<=4);
		
		System.out.println("\nProgram ended as you have selected invalid option ");

		sc.close();
	}

}
